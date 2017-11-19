/*
 * API SIMCA
 * SIMCA API Client
 *
 * OpenAPI spec version: 1.0.4
 * Contact: pdgsimca@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AddPlaceDTO;
import io.swagger.client.model.ErrorDTO;
import io.swagger.client.model.PlaceDTO;
import io.swagger.client.model.PlacesDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlaceControllerApi
 */
@Ignore
public class PlaceControllerApiTest {

    private final PlaceControllerApi api = new PlaceControllerApi();

    
    /**
     * Create a place
     *
     * Create a place. Latitude and longitude will be shown in a map, make sure they match with the given address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPlaceUsingPOSTTest() throws ApiException {
        AddPlaceDTO addPlaceDTO = null;
        api.createPlaceUsingPOST(addPlaceDTO);

        // TODO: test validations
    }
    
    /**
     * Delete a place
     *
     * Delete a place by a given id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLugarUsingDELETETest() throws ApiException {
        Integer idPlace = null;
        api.deleteLugarUsingDELETE(idPlace);

        // TODO: test validations
    }
    
    /**
     * Edit a place
     *
     * Edit a place with a given id. All values must be valid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPlaceUsingPUTTest() throws ApiException {
        PlaceDTO placeDTO = null;
        api.editPlaceUsingPUT(placeDTO);

        // TODO: test validations
    }
    
    /**
     * Get a place
     *
     * Fetch a place by a given place id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaceUsingGETTest() throws ApiException {
        Integer idPlace = null;
        PlaceDTO response = api.getPlaceUsingGET(idPlace);

        // TODO: test validations
    }
    
    /**
     * Get all places
     *
     * Fetch all registered places
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlacesUsingGETTest() throws ApiException {
        PlacesDTO response = api.getPlacesUsingGET();

        // TODO: test validations
    }
    
}