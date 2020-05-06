package guru.springframework.services;

import java.util.Set;

import guru.springframework.commands.UnitOfMeasureCommand;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
