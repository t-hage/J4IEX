package com.tom.client;

import com.tom.model.*;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

public class IEXClient extends BaseClient {

    public CompanyInformationDto getCompanyInformation(String symbol) {
        return get("stock/" + symbol + "/company", CompanyInformationDto.class);
    }

    public ArrayList<ChartEntryDto> getHistoricData(String symbol, TimeRange range) {
        return getList("stock/" + symbol + "/chart/" + range.toString());
    }

    public ArrayList<CompanyOverviewDto> getSectorCollection(Sector sector) throws UnsupportedEncodingException {
        String encodedCollectionName = URLEncoder.encode(sector.toString(), "UTF-8").replace("+", "%20");
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("collectionName", encodedCollectionName);

        return getList("/stock/market/collection/sector", queryParams);
    }

    public CompanyFinancialsDto getCompanyFinancials(String symbol) {
        return get("/stock/" + symbol + "/financials", CompanyFinancialsDto.class);
    }

}

