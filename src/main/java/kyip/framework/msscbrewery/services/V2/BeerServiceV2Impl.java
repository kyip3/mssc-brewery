package kyip.framework.msscbrewery.services.V2;

import kyip.framework.msscbrewery.web.model.V2.BeerDtoV2;
import kyip.framework.msscbrewery.web.model.V2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).beerName("Bud Light").beerStyle(BeerStyleEnum.STOUT).build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID id, BeerDtoV2 beerDto) {
        //to impl
    }

    @Override
    public void deleteBeer(UUID id) {
        //to impl
    }
}
