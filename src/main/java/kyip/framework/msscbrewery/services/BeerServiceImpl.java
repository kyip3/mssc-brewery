package kyip.framework.msscbrewery.services;

import kyip.framework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
        //TODO update beer
    }

    @Override
    public void deleteBeer(UUID id) {
        //TODO delete beer
    }
}
