package com;

import android.support.v4.app.DialogFragment;

public class OrderConfirmDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //ダイアログビルダーを生成
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //ダイアログのタイトルを設定
        buirder.setTitle(R.string.dialog_title);
        //ダイアログのメッセージを設定
        builder.setMessage(R.string.dialog_msg);
        //Positive Buttonを設定
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        //Negative Buttonを設定
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        //Neutral Buttonを設定
        builder.setNeutralButton(R.string.dialog_btn_nu, new DialogButtonClickListener());
        //ダイアログオブジェクトを生成し、リターン
        AlertDialog dialog = builder.create();
        return dialog;
        }
}

private class DialogButtonClickListener implements DialogInterface.OnClickListener {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        //トーストメッセージ用文字列変数を用意。
        String msg = "";
        //タップされたアクションボタンで分岐
        switch(shich) {
        //Positive Buttonならば
            case DialogInterface.BUTTON_POSITIVE:
                //注意用のメッセージ
                msg = getString(R.string.dialog_ok_toast);
                break;
        //Negative Buttonならば
            case DialogInterface.BUTTON_NEGATIVE:
                //キャンセル用のメッセージを格納。
                msg = getString(R.string.dialog_ng_toast);
                break;
        //Neutral Buttonならば
            case DialogInterface.BUTTON_NEUTRAL:
                //問い合わせ用のメッセージを格納。
                msg = getString(R.string.dialog_nu_toast);
                break;
        }
        //トーストの表示
        Toast.makeTest(getActivity(), msg, Toast.LENGTH_LONG).show()

    }
}
