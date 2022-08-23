package com.aya.asteroidradarapp.domain.model

data class EarthModel(
    var id : Int = 0 ,
    val name : String ,
    val absoluteMagnitude: Double,
    val estimatedDiameter: EstimatedDiameter,
    val isPotentiallyHazardousAsteroid: Boolean,
    val closeApproachData: List<CloseApproachData>
)

data class EstimatedDiameter(
    val kilometers: Kilometers,
)
data class Kilometers(
    val estimated_diameter_max: Double,
    val estimated_diameter_min: Double
)
data class CloseApproachData(
     val closeApproachDate: String,
     val missDistance: MissDistance,
     val relativeVelocity: RelativeVelocity,
)

data class MissDistance(
    val astronomical: String,
)

data class RelativeVelocity(
    val kilometers_per_second: String,
)
