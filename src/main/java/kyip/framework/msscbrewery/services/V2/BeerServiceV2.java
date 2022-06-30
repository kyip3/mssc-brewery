package kyip.framework.msscbrewery.services.V2;

import kyip.framework.msscbrewery.web.model.V2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID id, BeerDtoV2 beerDto);

    void deleteBeer(UUID id);
}
