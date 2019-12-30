package com.utsman.kemana.state

import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.Style
import com.utsman.feature.remote.model.Direction
import com.utsman.kemana.impl.BaseRenderMapsView

interface MainStateMapsView {
    fun mapsNormal(mapboxMap: MapboxMap, style: Style) : BaseRenderMapsView
    fun mapsReady(mapboxMap: MapboxMap, style: Style, direction: Direction) : BaseRenderMapsView
    fun mapsOrder(mapboxMap: MapboxMap, style: Style) : BaseRenderMapsView
}