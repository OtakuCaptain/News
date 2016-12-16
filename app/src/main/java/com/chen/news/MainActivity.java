package com.chen.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private ContactFragment contactFragment;
    private ConversationFragment conversationFragment;
    private PluginFragment pluginFragment;
    private FragmentManager fragmentManager;
    private List<Fragment> fragments;
    private RadioGroup radioGroup;
    private ViewPager viewPager;
    private MyFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        fragmentManager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        viewPager = (ViewPager) findViewById(R.id.viewpager);


        contactFragment = new ContactFragment();
        conversationFragment = new ConversationFragment();
        pluginFragment = new PluginFragment();
        fragments.add(contactFragment);
        fragments.add(conversationFragment);
        fragments.add(pluginFragment);


        adapter = new MyFragmentAdapter(fragmentManager, fragments);
        viewPager.setAdapter(adapter);

        //设置默认打开页面一聊天界面
        radioGroup.check(R.id.button1);
        //给ViewPager设置页面滑动监听，使得每次滑动页面下方RadioButton也被选中
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        radioGroup.check(R.id.button1);
                        break;
                    case 1:
                        radioGroup.check(R.id.button2);
                        break;
                    case 2:
                        radioGroup.check(R.id.button3);
                        break;
                    default:
                        break;
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        //给RadioButton设置监听。使得选中时，对应的
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {

                    case R.id.button1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.button2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.button3:
                        viewPager.setCurrentItem(2);
                        break;
                    default:
                        break;
                }


            }

        });

    }
}
