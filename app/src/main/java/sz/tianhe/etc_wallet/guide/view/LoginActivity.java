package sz.tianhe.etc_wallet.guide.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;

import sz.tianhe.baselib.navagation.AdapterNavagation;
import sz.tianhe.baselib.navagation.IBaseNavagation;
import sz.tianhe.baselib.view.activity.BaseActivity;
import sz.tianhe.etc_wallet.R;
import sz.tianhe.etc_wallet.databinding.ActivityLoginBinding;
import sz.tianhe.etc_wallet.guide.presenter.LoginPresenter;
import sz.tianhe.etc_wallet.main.MainActivity;

public class LoginActivity extends BaseActivity {

    ActivityLoginBinding binding;

    LoginPresenter loginPresenter;

    AdapterNavagation adapterNavagation;

    @Override
    public int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public IBaseNavagation navagation() {
        adapterNavagation = new AdapterNavagation(this)
                .setBack()
                .setNavagationBackgroudColor(R.color.colorPrimary);
        return adapterNavagation;
    }

    @Override
    public void initView() {
    }

    @Override
    public void findViews() {
        binding.btnLogin.setOnClickListener(v ->
        {
            Intent intent = new Intent(LoginActivity.this, FirstChooseActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("data","登录");
            startActivity(intent);
        });
    }

    @Override
    protected View bindViews() {
        binding = DataBindingUtil.inflate(LayoutInflater.from(this), layoutId(), null, false);
        return binding.getRoot();
    }
}
