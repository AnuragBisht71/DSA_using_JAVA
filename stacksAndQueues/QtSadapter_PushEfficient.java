package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class QtSadapter_PushEfficient {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return this.mainQ.size();
        }

        void push(int val) {
            this.mainQ.add(val);
        }

        int pop() {
            if(this.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }

            while(this.mainQ.size() > 1) {
                this.helperQ.add(this.mainQ.remove());
            }

            int tme = this.mainQ.remove();
            Queue<Integer> tmp = mainQ;
            mainQ = helperQ;
            helperQ = tmp;
            return tme;
        }
        
        int top() {
            if(this.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }

            while(this.mainQ.size() > 1) {
                this.helperQ.add(this.mainQ.remove());
            }

            int tme = this.mainQ.remove();
            this.helperQ.add(tme);
            
            Queue<Integer> tmp = mainQ;
            mainQ = helperQ;
            helperQ = tmp;
            return tme;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}

// Input :-

// push 10
// push 20
// push 5
// push 8
// push 2
// push 4
// push 11
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// top
// size
// pop
// quit

// Output :-

// 11
// 7
// 11
// 4
// 6
// 4
// 2
// 5
// 2
// 8
// 4
// 8
// 5
// 3
// 5
// 20
// 2
// 20
// 10
// 1
// 10


