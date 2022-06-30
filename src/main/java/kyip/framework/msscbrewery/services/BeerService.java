package kyip.framework.msscbrewery.services;

import kyip.framework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID id, BeerDto beerDto);

    void deleteBeer(UUID id);
}
