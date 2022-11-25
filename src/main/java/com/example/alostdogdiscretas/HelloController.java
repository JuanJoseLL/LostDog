package com.example.alostdogdiscretas;

import com.example.alostdogdiscretas.model.Graph;
import com.example.alostdogdiscretas.model.Vertex;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import java.util.Random;

public class HelloController {

    public Graph graph;
    @FXML
    private Button buttonEmpezar;
    private ArrayList<String> names;
    private int A=0;
    private Random rd=new Random();
    @FXML
    private TextField nombre1;
    @FXML
    private Button triggerBFS;
    @FXML
    void load(ActionEvent event){
        load();
    }
    @FXML
    void changeA(ActionEvent event) {
        if(A==0){
            load();
        }
        if(graph.search(nombre1.getText())==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong name");
            alert.setContentText("Type a valid name");
            alert.showAndWait();
        }else{
            graph.dijkstra(nombre1.getText(), names.get(rd.nextInt(names.size()-1)));

            String message=graph.message.replace("null","");

            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Path");
            alert.setHeaderText("Shortest path");
            alert.setContentText("These people will guide you to your pet "+message+"  and you wil find it in "+graph.distance+" hours");
            alert.showAndWait();
        }

    }
    @FXML
    void depurar(ActionEvent event){
        load();
        A++;
        if(graph.search(nombre1.getText())==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong name");
            alert.setContentText("Type a valid name");
            alert.showAndWait();
        }else{
            graph.BFS(nombre1.getText());
            boolean flag=true;
            ArrayList<Vertex> aux=new ArrayList<>();
            for(int i=0;i < 4 && flag;i++){
                for (int j=0;j<graph.getVertexes().size();j++){

                    if(graph.getVertexes().get(j).getColor()==2){

                        aux.add(graph.getVertexes().get(j));
                    }
                }
            }

            int a=graph.getVertexes().size();
            graph.getVertexes().removeAll(aux);
            int b=graph.getVertexes().size();
            int c=a-b;
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Depuration");
            alert.setHeaderText("Proces completed");
            alert.setContentText(c+" ocurrences have been removed ");
            alert.showAndWait();
        }




        A--;
    }
    public void load(){
        graph=new Graph();
        names=new ArrayList<>();


        names.add(graph.newVertex("Bao"));
        names.add(graph.newVertex("MinLing"));
        names.add(graph.newVertex("Shun"));
        names.add(graph.newVertex("Xiang"));
        names.add(graph.newVertex("Jian"));
        names.add(graph.newVertex("Yong"));
        names.add(graph.newVertex("Kang"));
        names.add(graph.newVertex("Lok"));
        names.add(graph.newVertex("Fa"));
        names.add(graph.newVertex("Ming"));
        names.add(graph.newVertex("Hao"));
        names.add(graph.newVertex("Mu"));
        names.add(graph.newVertex("Wong"));
        names.add(graph.newVertex("Fo"));
        names.add(graph.newVertex("Dalai"));
        names.add(graph.newVertex("Hong"));
        names.add(graph.newVertex("Dong"));
        names.add(graph.newVertex("Yun"));
        names.add(graph.newVertex("Tai"));
        names.add(graph.newVertex("Wen"));
        names.add(graph.newVertex("Qiang"));
        names.add(graph.newVertex("Rong"));
        names.add(graph.newVertex("Ning"));
        names.add(graph.newVertex("Lee"));
        names.add(graph.newVertex("Yin"));
        names.add(graph.newVertex("Zheng"));
        names.add(graph.newVertex("Mao"));
        names.add(graph.newVertex("Fei"));
        names.add(graph.newVertex("Lixue"));
        names.add(graph.newVertex("Xin qian"));
        names.add(graph.newVertex("Shang chi"));
        names.add(graph.newVertex("Mei yin"));
        names.add(graph.newVertex("Kyon"));
        names.add(graph.newVertex("Yuan yi"));
        names.add(graph.newVertex("Wan"));
        names.add(graph.newVertex("Yuga"));
        names.add(graph.newVertex("Wei"));
        names.add(graph.newVertex("Ping"));
        names.add(graph.newVertex("Ling su"));
        names.add(graph.newVertex("Deshi"));
        names.add(graph.newVertex("Wu"));
        names.add(graph.newVertex("Joon"));
        names.add(graph.newVertex("Chin Chon"));
        names.add(graph.newVertex("Ding Dong"));
        names.add(graph.newVertex("Meiying"));
        names.add(graph.newVertex("Xiaoming"));
        names.add(graph.newVertex("Huawei"));
        names.add(graph.newVertex("Mulan"));
        names.add(graph.newVertex("Xiao"));
        names.add(graph.newVertex("Xiao Yu"));
        names.add(graph.newVertex("Yan Yan"));
        graph.addEdge(names.get(0),names.get(1),3);
        graph.addEdge(names.get(0),names.get(2),5);
        graph.addEdge(names.get(1),names.get(2),6);
        graph.addEdge(names.get(1),names.get(13),2);
        graph.addEdge(names.get(2),names.get(3),8);
        graph.addEdge(names.get(2),names.get(5),2);
        graph.addEdge(names.get(3),names.get(6),5);
        graph.addEdge(names.get(3),names.get(9),6);
        graph.addEdge(names.get(3),names.get(11),9);
        graph.addEdge(names.get(4),names.get(13),1);
        graph.addEdge(names.get(4),names.get(14),3);
        graph.addEdge(names.get(5),names.get(10),5);
        graph.addEdge(names.get(5),names.get(26),7);
        graph.addEdge(names.get(6),names.get(7),1);
        graph.addEdge(names.get(7),names.get(26),4);
        graph.addEdge(names.get(8),names.get(9),2);
        graph.addEdge(names.get(8),names.get(25),8);
        graph.addEdge(names.get(10),names.get(11),1);
        graph.addEdge(names.get(11),names.get(12),9);
        graph.addEdge(names.get(12),names.get(19),6);
        graph.addEdge(names.get(13),names.get(15),4);
        graph.addEdge(names.get(14),names.get(22),3);
        graph.addEdge(names.get(15),names.get(16),5);
        graph.addEdge(names.get(16),names.get(19),2);
        graph.addEdge(names.get(16),names.get(17),1);
        graph.addEdge(names.get(17),names.get(18),8);
        graph.addEdge(names.get(17),names.get(29),4);
        graph.addEdge(names.get(19),names.get(20),6);
        graph.addEdge(names.get(19),names.get(23),3);
        graph.addEdge(names.get(21),names.get(28),4);
        graph.addEdge(names.get(21),names.get(44),7);
        graph.addEdge(names.get(22),names.get(23),1);
        graph.addEdge(names.get(23),names.get(24),1);
        graph.addEdge(names.get(24),names.get(32),5);
        graph.addEdge(names.get(26),names.get(44),8);
        graph.addEdge(names.get(27),names.get(32),4);
        graph.addEdge(names.get(27),names.get(36),7);
        graph.addEdge(names.get(27),names.get(33),5);
        graph.addEdge(names.get(28),names.get(35),9);
        graph.addEdge(names.get(30),names.get(34),7);
        graph.addEdge(names.get(30),names.get(41),6);
        graph.addEdge(names.get(31),names.get(36),2);
        graph.addEdge(names.get(31),names.get(38),1);
        graph.addEdge(names.get(34),names.get(41),3);
        graph.addEdge(names.get(35),names.get(41),3);
        graph.addEdge(names.get(35),names.get(42),4);
        graph.addEdge(names.get(36),names.get(42),6);
        graph.addEdge(names.get(39),names.get(37),4);
        graph.addEdge(names.get(39),names.get(46),4);
        graph.addEdge(names.get(40),names.get(42),1);
        graph.addEdge(names.get(40),names.get(43),1);
        graph.addEdge(names.get(40),names.get(47),2);
        graph.addEdge(names.get(41),names.get(48),3);
        graph.addEdge(names.get(45),names.get(46),3);
        graph.addEdge(names.get(45),names.get(47),7);
        graph.addEdge(names.get(45),names.get(49),9);
        graph.addEdge(names.get(48),names.get(49),9);
        graph.addEdge(names.get(48),names.get(50),8);

    }

}
