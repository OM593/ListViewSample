package com.websarva.wings.android.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
public class ListViewSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample);
    }
    /**
     * リストがタップされた時の処理が記述されたメンバクラス。
     */
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //タップされた定食名を取得。
            String item = (String) parent.getItemAtPosition(position);
            //トーストで表示する文字列を生成。
            String show = "あなたが選んだ定食: " + item;
            //トーストの表示
            Toast.makeText(ListViewSample.this, show, Toast.LENGTH_LONG).show();
        }
    }
}
