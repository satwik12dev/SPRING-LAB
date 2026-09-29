package in.naresh.databaseproject.rollgenerate;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.EventType;
import org.hibernate.generator.BeforeExecutionGenerator;

import java.util.EnumSet;
import java.util.Random;

public class RollNoGenerator implements BeforeExecutionGenerator {

    private final Random random = new Random();

    @Override
    public Object generate(
            SharedSessionContractImplementor session,
            Object owner,
            Object currentValue,
            EventType eventType) {

        int number = 1000000 + random.nextInt(9000000);

        return "TCA" + number;
    }

    @Override
    public EnumSet<EventType> getEventTypes() {
        return EnumSet.of(EventType.INSERT);
    }
}