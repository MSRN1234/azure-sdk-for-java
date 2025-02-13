// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ForecastingModels. */
public final class ForecastingModels extends ExpandableStringEnum<ForecastingModels> {
    /** Static value AutoArima for ForecastingModels. */
    public static final ForecastingModels AUTO_ARIMA = fromString("AutoArima");

    /** Static value Prophet for ForecastingModels. */
    public static final ForecastingModels PROPHET = fromString("Prophet");

    /** Static value Naive for ForecastingModels. */
    public static final ForecastingModels NAIVE = fromString("Naive");

    /** Static value SeasonalNaive for ForecastingModels. */
    public static final ForecastingModels SEASONAL_NAIVE = fromString("SeasonalNaive");

    /** Static value Average for ForecastingModels. */
    public static final ForecastingModels AVERAGE = fromString("Average");

    /** Static value SeasonalAverage for ForecastingModels. */
    public static final ForecastingModels SEASONAL_AVERAGE = fromString("SeasonalAverage");

    /** Static value ExponentialSmoothing for ForecastingModels. */
    public static final ForecastingModels EXPONENTIAL_SMOOTHING = fromString("ExponentialSmoothing");

    /** Static value Arimax for ForecastingModels. */
    public static final ForecastingModels ARIMAX = fromString("Arimax");

    /** Static value TCNForecaster for ForecastingModels. */
    public static final ForecastingModels TCNFORECASTER = fromString("TCNForecaster");

    /** Static value ElasticNet for ForecastingModels. */
    public static final ForecastingModels ELASTIC_NET = fromString("ElasticNet");

    /** Static value GradientBoosting for ForecastingModels. */
    public static final ForecastingModels GRADIENT_BOOSTING = fromString("GradientBoosting");

    /** Static value DecisionTree for ForecastingModels. */
    public static final ForecastingModels DECISION_TREE = fromString("DecisionTree");

    /** Static value KNN for ForecastingModels. */
    public static final ForecastingModels KNN = fromString("KNN");

    /** Static value LassoLars for ForecastingModels. */
    public static final ForecastingModels LASSO_LARS = fromString("LassoLars");

    /** Static value SGD for ForecastingModels. */
    public static final ForecastingModels SGD = fromString("SGD");

    /** Static value RandomForest for ForecastingModels. */
    public static final ForecastingModels RANDOM_FOREST = fromString("RandomForest");

    /** Static value ExtremeRandomTrees for ForecastingModels. */
    public static final ForecastingModels EXTREME_RANDOM_TREES = fromString("ExtremeRandomTrees");

    /** Static value LightGBM for ForecastingModels. */
    public static final ForecastingModels LIGHT_GBM = fromString("LightGBM");

    /** Static value XGBoostRegressor for ForecastingModels. */
    public static final ForecastingModels XGBOOST_REGRESSOR = fromString("XGBoostRegressor");

    /**
     * Creates or finds a ForecastingModels from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForecastingModels.
     */
    @JsonCreator
    public static ForecastingModels fromString(String name) {
        return fromString(name, ForecastingModels.class);
    }

    /**
     * Gets known ForecastingModels values.
     *
     * @return known ForecastingModels values.
     */
    public static Collection<ForecastingModels> values() {
        return values(ForecastingModels.class);
    }
}
