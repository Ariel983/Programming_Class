package Semana11;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class App {

    public static void main(String[] args) throws InterruptedException {

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        //Crear el Subscriber
        PrintSuscriber printer = new PrintSuscriber();

        //crear la subscribcion
        publisher.subscribe(printer);

        List<String> items = List.of("1","x","2","x","3","x");
        items.forEach(publisher::submit);

        Thread.sleep(1 * 1000);


    }
}
