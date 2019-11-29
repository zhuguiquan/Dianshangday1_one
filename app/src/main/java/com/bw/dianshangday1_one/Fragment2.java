package com.bw.dianshangday1_one;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * DateTime:2019/11/29 0029
 * author:朱贵全(Administrator)
 * function:
 */
public class Fragment2 extends BaseFragment {

    private Button button;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    protected int layoutId() {
        return R.layout.fragment2;
    }
}
