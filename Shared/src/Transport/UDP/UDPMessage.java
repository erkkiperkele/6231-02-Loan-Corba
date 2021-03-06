package Transport.UDP;

import java.io.Serializable;

public class UDPMessage implements Serializable {

    private IOperationMessage message;
    private OperationType operation;

    public UDPMessage(IOperationMessage message, OperationType operation) {
        this.message = message;
        this.operation = operation;
    }

    public IOperationMessage getMessage() {
        return message;
    }

    public OperationType getOperation() {
        return operation;
    }
}
