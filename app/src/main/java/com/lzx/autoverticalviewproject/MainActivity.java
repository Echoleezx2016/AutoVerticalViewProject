package com.lzx.autoverticalviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.lzx.autoverticallibrary.bean.AutoVerticalViewDataData;
import com.lzx.autoverticallibrary.utils.AutoVerticalViewView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AutoVerticalViewView autoVerticalViewView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoVerticalViewView = (AutoVerticalViewView) findViewById(R.id.tb);
        final List<AutoVerticalViewDataData> data = new ArrayList<AutoVerticalViewDataData>();
        data.add(new AutoVerticalViewDataData("疯传", "不动产统一登记年底全国联网 可以“以人查房”吗？", "1"));
        data.add(new AutoVerticalViewDataData("头条", "男科医院聘美女主播直播招揽病人 当地介入调查", "2"));
        data.add(new AutoVerticalViewDataData("热议", "年轻人专属 15万内高人气两厢家用车推荐", "3"));
        data.add(new AutoVerticalViewDataData("哈哈", "韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑,韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑韩检方第4次看守所中讯问朴槿惠 集中调查受贿嫌疑", "4"));
        data.add(new AutoVerticalViewDataData("呵呵", "特朗普任内对朝采取军事行动？ 美或为此付出代价", "5"));
        autoVerticalViewView.setViews(data);
        autoVerticalViewView.setOnItemClickListener(new AutoVerticalViewView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "你点击了" + data.get(position).getValue(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
