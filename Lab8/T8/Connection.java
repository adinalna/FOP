/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8;

/**
 *
 * @author adina
 */
public class Connection {
    private static int numofConnections=0;

    public Connection() {
        Connect();
        numofConnections++;
    }
    
    public void Connect(){
        System.out.println("Connected to the server! ("+(numofConnections+1)+")");
    }
    
    public void Disconnect(){
        System.out.println("One connection is disconnected");
        numofConnections--;
    }

    public static void DisplayConnect(){
        System.out.println("Number of Connections: "+numofConnections);
    }
    
    public static void main(String[] args) {
        Connection connect1 = new Connection();
        Connection connect2 = new Connection();
        Connection connect3 = new Connection();
        connect1.Disconnect();
        Connection.DisplayConnect();
    }
    
    
    
}
