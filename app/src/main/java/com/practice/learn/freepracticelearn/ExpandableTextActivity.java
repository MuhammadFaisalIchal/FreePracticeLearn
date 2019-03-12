package com.practice.learn.freepracticelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ExpandableTextActivity extends AppCompatActivity {

    ExpandableTextView expandableTextView;
    String longText = "From they fine john he give of rich he. They age and draw mrs like. Improving end distrusts may instantly was household applauded incommode. Why kept very ever home mrs. Considered sympathize ten uncommonly occasional assistance sufficient not. Letter of on become he tended active enable to. Vicinity relation sensible sociable surprise screened no up as. \n" +
            "\n" +
            "In entirely be to at settling felicity. Fruit two match men you seven share. Needed as or is enough points. Miles at smart \uFEFFno marry whole linen mr. Income joy nor can wisdom summer. Extremely depending he gentleman improving intention rapturous as. \n" +
            "\n" +
            "Feet evil to hold long he open knew an no. Apartments occasional boisterous as solicitude to introduced. Or fifteen covered we enjoyed demesne is in prepare. In stimulated my everything it literature. Greatly explain attempt perhaps in feeling he. House men taste bed not drawn joy. Through enquire however do equally herself at. Greatly way old may you present improve. Wishing the feeling village him musical. \n" +
            "\n" +
            "On am we offices expense thought. Its hence ten smile age means. Seven chief sight far point any. Of so high into easy. Dashwoods eagerness oh extensive as discourse sportsman frankness. Husbands see disposed surprise likewise humoured yet pleasure. Fifteen no inquiry cordial so resolve garrets as. Impression was estimating surrounded solicitude indulgence son shy. \n" +
            "\n" +
            "Imagine was you removal raising gravity. Unsatiable understood or expression dissimilar so sufficient. Its party every heard and event gay. Advice he indeed things adieus in number so uneasy. To many four fact in he fail. My hung it quit next do of. It fifteen charmed by private savings it mr. Favourable cultivated alteration entreaties yet met sympathize. Furniture forfeited sir objection put cordially continued sportsmen. \n" +
            "\n" +
            "Started several mistake joy say painful removed reached end. State burst think end are its. Arrived off she elderly beloved him affixed noisier yet. An course regard to up he hardly. View four has said does men saw find dear shy. Talent men wicket add garden. \n" +
            "\n" +
            "In up so discovery my middleton eagerness dejection explained. Estimating excellence ye contrasted insensible as. Oh up unsatiable advantages decisively as at interested. Present suppose in esteems in demesne colonel it to. End horrible she landlord screened stanhill. Repeated offended you opinions off dissuade ask packages screened. She alteration everything sympathize impossible his get compliment. Collected few extremity suffering met had sportsman. \n" +
            "\n" +
            "Kindness to he horrible reserved ye. Effect twenty indeed beyond for not had county. The use him without greatly can private. Increasing it unpleasant no of contrasted no continuing. Nothing colonel my no removed in weather. It dissimilar in up devonshire inhabiting. \n" +
            "\n" +
            "Sportsman do offending supported extremity breakfast by listening. Decisively advantages nor expression unpleasing she led met. Estate was tended ten boy nearer seemed. As so seeing latter he should thirty whence. Steepest speaking up attended it as. Made neat an on be gave show snug tore. \n" +
            "\n" +
            "He an thing rapid these after going drawn or. Timed she his law the spoil round defer. In surprise concerns informed betrayed he learning is ye. Ignorant formerly so ye blessing. He as spoke avoid given downs money on we. Of properly carriage shutters ye as wandered up repeated moreover. Inquietude attachment if ye an solicitude to. Remaining so continued concealed as knowledge happiness. Preference did how expression may favourable devonshire insipidity considered. An length design regret an hardly barton mr figure. \n" +
            "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_text);

        expandableTextView = findViewById(R.id.expandable_text_view);
        expandableTextView.setText(longText);
    }
}
