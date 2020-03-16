package Ekkel_s_Tasks.Chapter_06.Task_08;

public class ConnectionManager {
    private int number;
    private Connection [] connections ;

    private ConnectionManager() {
        number = 0 ;
        connections = new Connection [10] ;
        for (int i= 0 ; i < 10 ; i++) {
            connections[i] = Connection.toMakeNewConn() ;
            System.out.println("Connection " + i + " created!");
        }
        System.out.println("ConnectionManager is running!");
    }
    private Connection getConnection () throws Exception {
        if (this.number < 10)
        {   System.out.println("ConnectionManager give You connection #" + this.number);
            return this.connections[number++];}
        else {
            throw new Exception("I have no more Connections");
        }
    }

    public static void main(String[] args) {
        ConnectionManager myManager = new ConnectionManager() ;
        try {
        for (int i = 0; i < 11; i++) {
            System.out.println(myManager.getConnection());}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
