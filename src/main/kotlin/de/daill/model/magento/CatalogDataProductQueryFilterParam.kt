package de.daill.model.magento

data class CatalogDataProductQueryFilterParam(var group: Int = 0, var filterNo: Int = 0, var conditionType: String, var field: String, var value: String) {
    var paramBase = "searchCriteria[filterGroups][${group}][filters][${filterNo}]"

    var conditionParam = paramBase + "[conditionType]"
    var valueParam = paramBase + "[value]"
    var fieldParam = paramBase + "[field]"
}