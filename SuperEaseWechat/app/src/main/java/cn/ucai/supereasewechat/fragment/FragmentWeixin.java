package cn.ucai.supereasewechat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import cn.ucai.supereasewechat.R;

public class FragmentWeixin extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_weixin, container, false);
        ButterKnife.bind(this, layout);
        return layout;
    }
}
