package com.aya.asteroidradarapp.domain.response

import com.aya.asteroidradarapp.domain.model.EarthModel

class FeedResponse (
    val near_earth_objects: ListEarthModel,
    val element_count: String

)

class ListEarthModel(
    val near_earth_objects : List<EarthModel>
)