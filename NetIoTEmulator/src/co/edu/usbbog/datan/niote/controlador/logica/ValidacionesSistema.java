/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.datan.niote.controlador.logica;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 *
 * @author Andrés Sánchez, Juan Ochoa, Sebastian Villanueva, Gabriel Peña.
 */
public class ValidacionesSistema {

    Socket socket;

    public ValidacionesSistema() {
    }

    /**
     *
     * @return
     */
    public boolean estaConfiguradoElSistema() {
        return (configuracionMQTT() && configuracionTCPIP());
    }

    

    public void enviarMensajeMosquitto(String content) {
        String topic = "prueba/neiote";
        int qos = 2;
        String broker = "tcp://localhost:1883";
        String clientId = "prueba";
        MemoryPersistence persistence = new MemoryPersistence();
        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();

            if (sampleClient.isConnected()) {

            } else {
                connOpts.setCleanSession(true);
                System.out.println("Connecting to broker: " + broker);
                sampleClient.connect(connOpts);
            }
            System.out.println("Connected");
            System.out.println("Publishing message: " + content);

            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            System.out.println("Message published");
            //sampleClient.disconnect();
            //System.out.println("Disconnected");
            //System.exit(0);

        } catch (MqttException me) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }

    }
    /**
     *
     * @return
     */
    private boolean configuracionMQTT() {
        String topic = "prueba/neiote";
        int qos = 2;
        String broker = "tcp://localhost:1883";
        String clientId = "prueba";
        MemoryPersistence persistence = new MemoryPersistence();
        /*try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            String content = "Hola";
            if (sampleClient.isConnected()) {
                
            }else{
                connOpts.setCleanSession(true);
                sampleClient.connect(connOpts);
            }            
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            return true;
        } catch (MqttException me) {
            return false;
        }*/
        return true;
    }

    /**
     *
     * @return
     */
    private boolean configuracionTCPIP() {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(9999);
            if (serverSocket.getLocalPort() == -1) {
                return false;
            }
            serverSocket = new ServerSocket(9998);
            if (serverSocket.getLocalPort() == -1) {
                return false;
            }
            return true;

        } catch (IOException ex) {
            return false;
        }
    }

}
