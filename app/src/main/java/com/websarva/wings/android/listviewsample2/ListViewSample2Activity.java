package com.websarva.wings.android.listviewsample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.OrderConfirmDialogFragment;

public class ListViewSample2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample2);

        ListView lvMenu = findViewById(R.id.lvMenu);

        //リストビューにリスナを設定
        lvMenu.setOnItemClickListener(new ListItemClickListener());

        List<String> menuList = new ArrayList<>();

        menuList.add("からあげ定食");
        menuList.add("ハンバーグ定食");
        menuList.add("生姜焼き定食");
        menuList.add("ステーキ定食");
        menuList.add("野菜炒め定食");
        menuList.add("とんかつ定食");
        menuList.add("ミンチかつ定食");
        menuList.add("チキンカツ定食");
        menuList.add("コロッケ定食");
        menuList.add("焼き魚定食");
        menuList.add("焼肉定食");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ListViewSample2Activity.this, android.R.layout.simple_list_item_1, menuList)

        lvMenu.setAdapter(adapter);

        private class ListItemClickListener implements AdapterView.OnItemClickListener {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //注文確認ダイアログフラグメントオブジェクト生成
                OrderConfirmDialogFragment dialogFragment = new OrderConfirmDialogFragment();
                //ダイアログ表示
                dialogFragment.show(getSupportFragmentManager(), "OrderConfirmDialogFragment");
            }

        }

    }
}