package com.yash_desai.p26e1.inserting_data_in_database_using_asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class Asynchronous_Task extends AsyncTask<String,Void,String> {

    Context context;

    Asynchronous_Task(Context context) {
        this.context = context;
        Toast.makeText(context,"Asynchronous_Task Class\nInitialized....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected String doInBackground(String... params){
        DB_MAN Manager = new DB_MAN(context);
        Manager.Insert(Manager.getWritableDatabase(),MainActivity.DATA);
        return "Asynchronous Task Completed";
    }

    @Override
    protected void onPostExecute(String STR) {
        super.onPostExecute(STR);
        Toast.makeText(context,STR,Toast.LENGTH_LONG).show();
    }
}