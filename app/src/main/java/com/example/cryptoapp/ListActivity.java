package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    private TextView mNameTextView;
    private ListView mListView;
    private Button mFindListButton;

    private String[] cryptos = new String[] {
            "Bitcoin (BTC)", "Ethereum (ETH)", "Tether (USDT)", "Litecoin (LTC)","Cardano (ADA)", "Dogecoin (DOGE)","Polkadot (DOT)","Bitcoin Cash (BCH)", "Stellar (XLM)","Chainlink","Binance Coin (BNB)","Solana (SOL)", "Polygon (MATIC)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mListView = (ListView) findViewById(R.id.listView);
        mNameTextView = (TextView) findViewById(R.id.nameTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cryptos);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(ListActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Here is a list of cryptocurrencies for " + name);
    }
}