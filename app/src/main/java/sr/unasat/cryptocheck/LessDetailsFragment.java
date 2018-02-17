package sr.unasat.cryptocheck;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LessDetailsFragment extends ListFragment {

    private String[] list = {"BTC", "ETH", "XRP", "BCH", "LTC", "ADA", "XLM", "NEO", "EOS", "MIOTA", "DASH", "XEM", "DOGE", "ZCH"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Intent intent = new Intent(getContext(), MoreDetailsActivity.class);
        String message = list[position].toString();
        intent.putExtra(MoreDetailsActivity.EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
