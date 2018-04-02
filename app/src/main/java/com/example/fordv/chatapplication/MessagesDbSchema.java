package com.example.fordv.chatapplication;


public class MessagesDbSchema {
    public static final class MessagesTable {
        public static final String NAME = "messages";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String USERID = "userid";
            public static final String PASSWORD = "password";
            public static final String MESSAGE = "message";
            public static final String SENT = "sent";
        }
    }
}
