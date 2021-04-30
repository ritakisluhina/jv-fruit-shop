package core.basesyntax.service;

import core.basesyntax.model.Fruit;
import core.basesyntax.model.dto.FruitRecordDto;
import java.util.List;
import java.util.Map;

public interface FruitShopService {
    void applyOperationOnFruitsDt(List<FruitRecordDto> transactionDtos);

    Map<Fruit, Integer> getFruitsReport();
}
