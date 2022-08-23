package com.aya.asteroidradarapp.domain.response

import com.aya.asteroidradarapp.domain.model.EarthModel

class FeedResponse (
    val near_earth_objects: EarthModel,
    val element_count: String

)