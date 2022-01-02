package uz.pdp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.pdp.model.CustomMessage;
import uz.pdp.utils.DataBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



Thread thread=new Thread();
thread.run();
        DataBase.getDataFromPlaceHolder();

        try {
            TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);

            api.registerBot(new MyBot());


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        MyBot myBot = new MyBot();
        myBot.messageToUserService();

    }
}
