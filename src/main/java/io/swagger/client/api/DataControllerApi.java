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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ErrorDTO;
import io.swagger.client.model.MeasurementDataDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataControllerApi {
    private ApiClient apiClient;

    public DataControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getMeasurementPollutantDataUsingGET
     * @param measurementId measurementId (required)
     * @param pollutantId pollutantId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeasurementPollutantDataUsingGETCall(Integer measurementId, Integer pollutantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/data/v1/data";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (measurementId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "measurementId", measurementId));
        if (pollutantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pollutantId", pollutantId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeasurementPollutantDataUsingGETValidateBeforeCall(Integer measurementId, Integer pollutantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'measurementId' is set
        if (measurementId == null) {
            throw new ApiException("Missing the required parameter 'measurementId' when calling getMeasurementPollutantDataUsingGET(Async)");
        }
        
        // verify the required parameter 'pollutantId' is set
        if (pollutantId == null) {
            throw new ApiException("Missing the required parameter 'pollutantId' when calling getMeasurementPollutantDataUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeasurementPollutantDataUsingGETCall(measurementId, pollutantId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get measurement data
     * Fetch a measurement data.
     * @param measurementId measurementId (required)
     * @param pollutantId pollutantId (required)
     * @return MeasurementDataDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MeasurementDataDTO getMeasurementPollutantDataUsingGET(Integer measurementId, Integer pollutantId) throws ApiException {
        ApiResponse<MeasurementDataDTO> resp = getMeasurementPollutantDataUsingGETWithHttpInfo(measurementId, pollutantId);
        return resp.getData();
    }

    /**
     * Get measurement data
     * Fetch a measurement data.
     * @param measurementId measurementId (required)
     * @param pollutantId pollutantId (required)
     * @return ApiResponse&lt;MeasurementDataDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MeasurementDataDTO> getMeasurementPollutantDataUsingGETWithHttpInfo(Integer measurementId, Integer pollutantId) throws ApiException {
        com.squareup.okhttp.Call call = getMeasurementPollutantDataUsingGETValidateBeforeCall(measurementId, pollutantId, null, null);
        Type localVarReturnType = new TypeToken<MeasurementDataDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get measurement data (asynchronously)
     * Fetch a measurement data.
     * @param measurementId measurementId (required)
     * @param pollutantId pollutantId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeasurementPollutantDataUsingGETAsync(Integer measurementId, Integer pollutantId, final ApiCallback<MeasurementDataDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeasurementPollutantDataUsingGETValidateBeforeCall(measurementId, pollutantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MeasurementDataDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}