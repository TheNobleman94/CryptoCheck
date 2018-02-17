package sr.unasat.cryptocheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestActivity extends AppCompatActivity {

    private TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        mTextview = (TextView)findViewById(R.id.text);
        getCryptoData();
    }

    private void getCryptoData() {
        RequestQueue queue = Volley.newRequestQueue(this);
        final String cryptorequest = "https://api.coinmarketcap.com/v1/ticker/bitcoin";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, cryptorequest,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        List<CryptoDTO> cryptoDTOS = mapJsonToCryptoObject(response);
                        for(CryptoDTO crypto:cryptoDTOS) {
                            mTextview.setText(crypto.toString());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mTextview.setText("something went wrong");
            }
        });
        queue.add(stringRequest);
    }

    private List<CryptoDTO> mapJsonToCryptoObject(String jsonArray) {
        ObjectMapper mapper = new ObjectMapper();
        List<CryptoDTO> cryptoList = new ArrayList<>();
        List<Map<String, ?>> cryptoArray = null;
        CryptoDTO crypto = null;

        try {
            cryptoArray = mapper.readValue(jsonArray, List.class);
            for(Map<String, ?> map : cryptoArray) {
                crypto = new CryptoDTO((String)map.get("name"),(String)map.get("symbol"),
                        (String)map.get("rank"),(String)map.get("price_usd"),
                        (String)map.get("percent_change_1h"),(String)map.get("percent_change_24h"),
                        (String)map.get("percent_change_7d"),(String)map.get("last_updated"));
                cryptoList.add(crypto);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return cryptoList;
    }
}
