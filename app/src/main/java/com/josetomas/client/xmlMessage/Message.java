/*
Develop by Jose Gonzalez
2013 - Argentina
*/

package com.josetomas.client.xmlMessage;

public abstract class Message {

    MessageTypes type;

    public Message(MessageTypes type){
        this.type = type;
    }

    public MessageTypes getType(){
        return type;
    }

}
