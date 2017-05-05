package com.example.eva.hilosjaz;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by Gabriel on 02/05/2017.
 */

public class FetchBook extends AsyncTask<String,Void,String> {
    private TextView mTitleText;
    private TextView mAuthorText;

 public FetchBook(TextView mTitleText, TextView mAuthorText){
     this.mTitleText = mTitleText;
     this.mAuthorText = mAuthorText;
 }



    @Override
    protected String doInBackground(String... params) {
        return NetworkUtils.getBookInfo(params[0]);
    }
    @Override
    protected void onPostExecute(String s){
       super.onPostExecute(s);
    }
}
