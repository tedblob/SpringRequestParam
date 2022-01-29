package com.tedblob.spring.mvc.requestParam.converters;

import com.tedblob.spring.mvc.requestParam.enums.Direction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class StringToDirectionEnumConverter implements Converter<String, Direction> {

    @Override
    public Direction convert(String source) {
        try {
            return source.isEmpty() ? null : Direction.valueOf(source.trim().toUpperCase(Locale.ROOT));
        } catch(Exception e) {
            return Direction.UNKNOWN; //
        }
    }
}