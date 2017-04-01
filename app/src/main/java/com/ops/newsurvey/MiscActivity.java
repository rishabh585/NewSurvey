package com.ops.newsurvey;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MiscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ImageView banner = (ImageView) findViewById(R.id.banner);
        banner.setImageResource(R.drawable.politics_banner);

        final ArrayList<Question> questions = new ArrayList<>();
        ArrayList<String> opt = new ArrayList<String>();
        opt.add("Yes");
        opt.add("No");
        opt.add("Can't Say");
        questions.add(new Question("Miscellaneous Question 1",opt));
        questions.add(new Question("Miscellaneous Question 2",opt));
        questions.add(new Question("Miscellaneous Question 3",opt));
        questions.add(new Question("Miscellaneous Question 4",opt));
        questions.add(new Question("Miscellaneous Question 5",opt));
        questions.add(new Question("Miscellaneous Question 6",opt));
        questions.add(new Question("Miscellaneous Question 7",opt));
        questions.add(new Question("Miscellaneous Question 8",opt));
        questions.add(new Question("Miscellaneous Question 9",opt));
        questions.add(new Question("Miscellaneous Question 10",opt));

        QuestionAdapter Adapter=new QuestionAdapter(this,questions);
        ListView listView=(ListView) findViewById(R.id.List);
        listView.setAdapter(Adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

