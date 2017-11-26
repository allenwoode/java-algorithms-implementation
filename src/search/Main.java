package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    static final int max = 3;
    int count = 0;
    int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

    private void println() {
        System.out.println(String.format("%d-%d-%d-%d-%d-%d", a, b, c, d, e, f));
    }

    private void loop() {

        println();

        count++;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                stupid();
            }
        }, 50);
    }

    private void stupid2() {
        int[] seq = {0, 0, 0, 0, 0, 0};
        int len = seq.length;
        int count = 0;

        System.out.println(String.format("%d-%d-%d-%d-%d-%d", seq[0], seq[1], seq[2], seq[3], seq[4], seq[5]));

        for (int i=0; i < len; i++) {

            for (int j=0; j < max; j++) {

                //count++;

                seq[len-i-1] = j;
            }
        }
    }

    private void stupid3(int[] min, int[] max) {

        int len = min.length;
        int[] state = min;

        for (int i=0; i<len; i++) {

            int x = state[len-i-1];
            int a = min[len-i-1];
            int b = max[len-i-1];

            for (int j=a; j<b; j++, x++) {
                state[len-i-1] = x;
                show(state);
            }
        }


    }

    private void show(int[] state) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<state.length; i++) {
            sb.append(state[i]).append("-");
        }
        sb.deleteCharAt(state.length * 2 - 1);
        System.out.println(sb.toString());
    }

    private void stupid() {

        f++;
        if (a < max) {
            if (b < max) {
                if (c < max) {
                    if (d < max) {
                        if (e < max) {
                            if (f < max) {
                                loop();
                            } else {
                                f = 0;
                                e++;
                                loop();
                            }
                        } else {
                            f = 0;
                            e = 0;
                            d++;
                            loop();
                        }
                    } else {
                        f = 0;
                        e = 0;
                        d = 0;
                        c++;
                        loop();
                    }
                } else {
                    f = 0;
                    e = 0;
                    d = 0;
                    c = 0;
                    b++;
                    loop();
                }
            } else {
                f = 0;
                e = 0;
                d = 0;
                c = 0;
                b = 0;
                a++;
                loop();
            }
        } else {
            System.out.println("sum "+count);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        //main.loop();
        //main.stupid2();
        //int[] state = {1, 2, 3, 4, 5, 6};
        //int[] min   = {0, 0, 0, 0, 0, 0};
        //int[] max   = {3, 3, 3, 3, 3, 3};

        main.stupid();
    }


}
