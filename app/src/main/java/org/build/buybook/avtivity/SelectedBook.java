package org.build.buybook.avtivity;

import android.os.Bundle;

import org.build.buybook.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2015/10/18.
 */
public class SelectedBook extends BaseActivity {

    @OnClick(R.id.bar_back)
    public void back(){
        onBackPressed();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_book);
        ButterKnife.bind(this);
    }
}