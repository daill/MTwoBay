package de.daill.model.magento

data class CatalogDataProductQueryOrderParam(var group: Int = 0, var direction: String, var field: String) {
    var paramBase = "searchCriteria[sortOrders][${group}]"
    var directionParam = paramBase + "[direction]"
    var fieldParam = paramBase + "[field]"
}