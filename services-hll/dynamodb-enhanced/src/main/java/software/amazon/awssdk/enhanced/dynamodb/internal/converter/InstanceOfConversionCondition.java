package software.amazon.awssdk.enhanced.dynamodb.internal.converter;

import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.enhanced.dynamodb.converter.ConversionCondition;

@SdkInternalApi
@ThreadSafe
public class InstanceOfConversionCondition implements ConversionCondition {
    private final Class<?> clazz;

    public InstanceOfConversionCondition(Class<?> clazz) {
        this.clazz = clazz;
    }

    public boolean converts(Class<?> clazz) {
        return this.clazz.isAssignableFrom(clazz);
    }
}
