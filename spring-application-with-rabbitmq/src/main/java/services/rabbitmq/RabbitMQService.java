package services.rabbitmq;

public interface RabbitMQService {

    void sendMessageToRabbit(String idUser, String name, String password);
}
