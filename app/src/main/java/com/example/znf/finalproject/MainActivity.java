package com.example.znf.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static boolean choosed = false;
    private static int lastScore = 0;
    private static String lastName = "";
    private static final String TAG = "MainActivity";
    private int id;
    private personalitytest user = new personalitytest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_menu);
    }
    public void oneOnClick(View view) {
        Log.d(TAG, "one be click...");
    }
    public void goTo1st(View view) {
        choosed = false;
        setContentView(R.layout.first_q);
    }
    public void goToQs(View view) {
        choosed = false;
        setContentView(R.layout.activity_main);
    }

    public void goToEvaExtra(View view) {
        int[] score = user.getScores();
        if (score[0] >= 8) {
            setContentView(R.layout.eva_very_extra);
        } else if (score[0] > 0) {
            setContentView(R.layout.eva_mod_extra);
        } else if (score[0] == 0) {
            setContentView(R.layout.eva_neutral_extra);
        } else if (score[0] > -8) {
            setContentView(R.layout.eva_mod_intra);
        } else {
            setContentView(R.layout.eva_very_intra);
        }
    }
    public void goToEvaNeu(View view) {
        int[] score = user.getScores();
        if (score[0] >= 8) {
            setContentView(R.layout.eva_very_neu);
        } else if (score[0] > 0) {
            setContentView(R.layout.eva_mod_neu);
        } else if (score[0] == 0) {
            setContentView(R.layout.eva_neutral_neu);
        } else if (score[0] > -8) {
            setContentView(R.layout.eva_mod_non_neu);
        } else {
            setContentView(R.layout.eva_very_non_neu);
        }
    }
    public void goToEvaAgree(View view) {
        int[] score = user.getScores();
        if (score[0] >= 8) {
            setContentView(R.layout.eva_very_agree);
        } else if (score[0] > 0) {
            setContentView(R.layout.eva_mod_agree);
        } else if (score[0] == 0) {
            setContentView(R.layout.eva_neutral_agree);
        } else if (score[0] > -8) {
            setContentView(R.layout.eva_mod_disagree);
        } else {
            setContentView(R.layout.eva_very_disagree);
        }
    }
    public void goToEvaOpen(View view) {
        int[] score = user.getScores();
        if (score[0] >= 8) {
            setContentView(R.layout.eva_very_open);
        } else if (score[0] > 0) {
            setContentView(R.layout.eva_mod_open);
        } else if (score[0] == 0) {
            setContentView(R.layout.eva_neutral_open);
        } else if (score[0] > -8) {
            setContentView(R.layout.eva_mod_close);
        } else {
            setContentView(R.layout.eva_very_close);
        }
    }
    public void goToEvaCon(View view) {
        int[] score = user.getScores();
        if (score[0] >= 8) {
            setContentView(R.layout.eva_very_con);
        } else if (score[0] > 0) {
            setContentView(R.layout.eva_mod_con);
        } else if (score[0] == 0) {
            setContentView(R.layout.eva_neutral_con);
        } else if (score[0] > -8) {
            setContentView(R.layout.eva_mod_non_con);
        } else {
            setContentView(R.layout.eva_very_non_con);
        }
    }

    public void goToHome(View view) {
        setContentView(R.layout.start_menu);
    }
    public void goToLast(View view) {
        choosed = false;
        setContentView(R.layout.last_q);
    }
    public void goTo2(View view) {
        choosed = false;
        setContentView(R.layout.q2);
    }
    public void goTo3(View view) {
        choosed = false;
        setContentView(R.layout.q3);
    }
    public void goTo4(View view) {
        choosed = false;
        setContentView(R.layout.q4);
    }
    public void goTo5(View view) {
        choosed = false;
        setContentView(R.layout.q5);
    }
    public void goTo6(View view) {
        choosed = false;
        setContentView(R.layout.q6);
    }
    public void goTo7(View view) {
        choosed = false;
        setContentView(R.layout.q7);
    }
    public void goTo8(View view) {
        choosed = false;
        setContentView(R.layout.q8);
    }
    public void goTo9(View view) {
        choosed = false;
        setContentView(R.layout.q9);
    }
    public void goTo10(View view) {
        choosed = false;
        setContentView(R.layout.q10);
    }
    public void goTo11(View view) {
        choosed = false;
        setContentView(R.layout.q11);
    }
    public void goTo12(View view) {
        choosed = false;
        setContentView(R.layout.q12);
    }
    public void goTo13(View view) {
        choosed = false;
        setContentView(R.layout.q13);
    }
    public void goTo14(View view) {
        choosed = false;
        setContentView(R.layout.q14);
    }
    public void goTo15(View view) {
        choosed = false;
        setContentView(R.layout.q15);
    }
    public void goTo16(View view) {
        choosed = false;
        setContentView(R.layout.q16);
    }
    public void goTo17(View view) {
        choosed = false;
        setContentView(R.layout.q17);
    }
    public void goTo18(View view) {
        choosed = false;
        setContentView(R.layout.q18);
    }

    public void VeryAcc(View view) {
        String input = "";
        id = view.getId();
        if (id == R.id.extra0 || id == R.id.extra1 || id == R.id.extra2 || id == R.id.extra3) {
            input = "extraversionScore";
        } else if (id == R.id.agree0 || id == R.id.agree1 || id == R.id.agree2 ||
                id == R.id.agree3) {
            input = "agreeablenessScore";
        } else if (id == R.id.con0 || id == R.id.con1 || id == R.id.con2 ||
                id == R.id.con3) {
            input = "conscientiousnessScore";
        } else if (id == R.id.neu0 || id == R.id.neu1 || id == R.id.neu2 ||
                id == R.id.neu3) {
            input = "neuroticismScore";
        } else if (id == R.id.exper0 || id == R.id.exper1 || id == R.id.exper2 ||
                id == R.id.exper3) {
            input = "ExperienceOpennessScore";
        }
        if (choosed == true) {
            personalitytest.add(4 - lastScore, input);
        } else {
            personalitytest.add(4, input);
            choosed = true;
            lastScore = 4;
            lastName = input;
        }
    }
    public void ModAcc(View view) {
        String input = "";
        id = view.getId();
        if (id == R.id.extra0 || id == R.id.extra1 || id == R.id.extra2 || id == R.id.extra3) {
            input = "extraversionScore";
        } else if (id == R.id.agree0 || id == R.id.agree1 || id == R.id.agree2 ||
                id == R.id.agree3) {
            input = "agreeablenessScore";
        } else if (id == R.id.con0 || id == R.id.con1 || id == R.id.con2 ||
                id == R.id.con3) {
            input = "conscientiousnessScore";
        } else if (id == R.id.neu0 || id == R.id.neu1 || id == R.id.neu2 ||
                id == R.id.neu3) {
            input = "neuroticismScore";
        } else if (id == R.id.exper0 || id == R.id.exper1 || id == R.id.exper2 ||
                id == R.id.exper3) {
            input = "ExperienceOpennessScore";
        }
        if (choosed == true) {
            personalitytest.add(2 - lastScore, input);
        } else {
            personalitytest.add(2, input);
            choosed = true;
            lastScore = 2;
            lastName = input;
        }
    }
    public void ModInacc(View view) {
        String input = "";
        id = view.getId();
        if (id == R.id.extra0 || id == R.id.extra1 || id == R.id.extra2 || id == R.id.extra3) {
            input = "extraversionScore";
        } else if (id == R.id.agree0 || id == R.id.agree1 || id == R.id.agree2 ||
                id == R.id.agree3) {
            input = "agreeablenessScore";
        } else if (id == R.id.con0 || id == R.id.con1 || id == R.id.con2 ||
                id == R.id.con3) {
            input = "conscientiousnessScore";
        } else if (id == R.id.neu0 || id == R.id.neu1 || id == R.id.neu2 ||
                id == R.id.neu3) {
            input = "neuroticismScore";
        } else if (id == R.id.exper0 || id == R.id.exper1 || id == R.id.exper2 ||
                id == R.id.exper3) {
            input = "ExperienceOpennessScore";
        }
        if (choosed == true) {
            personalitytest.add(-2 - lastScore, input);
        } else {
            personalitytest.add(-2, input);
            choosed = true;
            lastScore = -2;
            lastName = input;
        }
    }
    public void VeryInacc(View view) {
        String input = "";
        id = view.getId();
        if (id == R.id.extra0 || id == R.id.extra1 || id == R.id.extra2 || id == R.id.extra3) {
            input = "extraversionScore";
        } else if (id == R.id.agree0 || id == R.id.agree1 || id == R.id.agree2 ||
                id == R.id.agree3) {
            input = "agreeablenessScore";
        } else if (id == R.id.con0 || id == R.id.con1 || id == R.id.con2 ||
                id == R.id.con3) {
            input = "conscientiousnessScore";
        } else if (id == R.id.neu0 || id == R.id.neu1 || id == R.id.neu2 ||
                id == R.id.neu3) {
            input = "neuroticismScore";
        } else if (id == R.id.exper0 || id == R.id.exper1 || id == R.id.exper2 ||
                id == R.id.exper3) {
            input = "ExperienceOpennessScore";
        }
        if (choosed == true) {
            personalitytest.add(-4 - lastScore, input);
        } else {
            personalitytest.add(-4, input);
            choosed = true;
            lastScore = -4;
            lastName = input;
        }

    }

}
