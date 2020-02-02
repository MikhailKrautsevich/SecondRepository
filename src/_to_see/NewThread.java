package _to_see;

    class NewThread implements Runnable
    {
        private Thread th ;
        NewThread()
        {th = new Thread(this) ;
        }
        public void run() {
            int Count = 0 ;
            while (Count < 100)
            {Count++ ;
                System.out.println(Count);}
        }
        void start() {
            th.start();
        }
    }
