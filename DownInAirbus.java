import java.util.Scanner;

public class DownInAirbus {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] airbus = new char[n][7];
        airbus[0] = scan.nextLine().toCharArray();
        for(int i = 0 ; i < n; i++){
            airbus[i] = scan.nextLine().toCharArray();
        }

        int m = scan.nextInt();
        String[] res = new String[m];
        res[0] = scan.nextLine();
        for(int i = 0; i < m;i++){
            res[i] = scan.nextLine();
        }
        long с = System.currentTimeMillis();
        for(int i = 0; i < m; i++){
            boolean flag = false;
            String[] pre = res[i].split(" ");
            int count = Integer.parseInt(pre[0]);
            if(pre[2].compareTo("window") == 0){
                if(pre[1].compareTo("left") == 0){
                    if(count == 3){
                        for(int j = 0; j < n; j++){
                            if('.' == airbus[j][0] && '.' == airbus[j][1] && '.' == airbus[j][2]){
                                airbus[j][0] = 'X';
                                airbus[j][1] = 'X';
                                airbus[j][2] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A " + (j+1) + "B " + (j+1) + "C");
                                show(airbus, n);
                                airbus[j][0] = '#';
                                airbus[j][1] = '#';
                                airbus[j][2] = '#';
                                flag=true;
                                break;
                            } else {
                               continue;
                            }
                        }
                        if(!flag)
                            System.out.println("Cannot fulfill passengers requirements.");
                    } else if(count == 2){
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][0] && '.' == airbus[j][1]) {
                                airbus[j][0] = 'X';
                                airbus[j][1] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A " + (j+1) + "B");
                                show(airbus, n);
                                airbus[j][0] = '#';
                                airbus[j][1] = '#';
                                flag=true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    } else{
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][0]) {
                                airbus[j][0] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A");
                                show(airbus, n);
                                airbus[j][0] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }
                } else {
                    if(count == 3){
                        for(int j = 0; j < n; j++){
                            if('.' == airbus[j][6] && '.' == airbus[j][5] && '.' == airbus[j][4]){
                                airbus[j][6] = 'X';
                                airbus[j][5] = 'X';
                                airbus[j][4] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D " + (j+1) + "E " + (j+1) + "F");
                                show(airbus, n);
                                airbus[j][6] = '#';
                                airbus[j][5] = '#';
                                airbus[j][4] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    } else if(count == 2){
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][6] && '.' == airbus[j][5]) {
                                airbus[j][6] = 'X';
                                airbus[j][5] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D " + (j+1) + "E");
                                show(airbus, n);
                                airbus[j][6] = '#';
                                airbus[j][5] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    } else{
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][6]) {
                                airbus[j][6] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D");
                                show(airbus, n);
                                airbus[j][6] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }
                }
            } else {
                if(pre[1].compareTo("left") == 0){
                    if(count == 3){
                        for(int j = 0; j < n; j++){
                            if('.' == airbus[j][2] && '.' == airbus[j][1] && '.' == airbus[j][0]){
                                airbus[j][2] = 'X';
                                airbus[j][1] = 'X';
                                airbus[j][0] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A " + (j+1) + "B " + (j+1) + "C");
                                show(airbus, n);
                                airbus[j][2] = '#';
                                airbus[j][1] = '#';
                                airbus[j][0] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }else if(count == 2){
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][2] && '.' == airbus[j][1]) {
                                airbus[j][2] = 'X';
                                airbus[j][1] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A " + (j+1) + "B");
                                show(airbus, n);
                                airbus[j][2] = '#';
                                airbus[j][1] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    } else{
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][2]) {
                                airbus[j][2] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "A");
                                show(airbus, n);
                                airbus[j][2] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }
                } else {
                    if(count == 3){
                        for(int j = 0; j < n; j++){
                            if('.' == airbus[j][4] && '.' == airbus[j][5] && '.' == airbus[j][6]){
                                airbus[j][4] = 'X';
                                airbus[j][5] = 'X';
                                airbus[j][6] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D " + (j+1) + "E " + (j+1) + "F");
                                show(airbus, n);
                                airbus[j][4] = '#';
                                airbus[j][5] = '#';
                                airbus[j][6] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }else if(count == 2){
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][4] && '.' == airbus[j][5]) {
                                airbus[j][4] = 'X';
                                airbus[j][5] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D " + (j+1) + "E");
                                show(airbus, n);
                                airbus[j][4] = '#';
                                airbus[j][5] = '#';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }else{
                        for(int j = 0; j < n; j++) {
                            if ('.' == airbus[j][4]) {
                                airbus[j][4] = 'X';
                                System.out.println("Passengers can take seats: " + (j+1) + "D");
                                show(airbus, n);
                                airbus[j][4] = 'X';
                                flag = true;
                                break;
                            } else {
                                continue;
                            }
                        }
                        if(!flag)
                        System.out.println("Cannot fulfill passengers requirements.");
                    }
                }
            }
        }

        System.out.println((double) (System.currentTimeMillis() - с));
    }
    public static void show(char[][] arr,int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}