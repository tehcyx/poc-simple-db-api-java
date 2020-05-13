package com.hybris.cloudnativedemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceOrder {


    private List<Entry> entries;

    public void setentries(List<Entry> entries) { this.entries = entries; }

    public List<Entry> getentries() { return this.entries; }

    public class Entry {

        private Integer quantity;
        private Product product;

        public void setquantity(Integer quantity) { this.quantity = quantity; }

        public Integer getquantity() { return this.quantity; }

        public void setproduct(Product product) { this.product = product; }

        public Product getproduct() { return this.product; }

        public class Product {
            private String name;

            public void setname(String name) { this.name = name; }

            public String getname() { return this.name; }
        }
    }


}

/*

{
  "appliedOrderPromotions": [
    {
      "consumedEntries": [
        {
          "adjustedUnitPrice": 0,
          "code": "string",
          "orderEntryNumber": 0,
          "quantity": 0
        }
      ],
      "description": "string",
      "promotion": {
        "code": "string",
        "couldFireMessages": [
          "string"
        ],
        "description": "string",
        "enabled": true,
        "endDate": "2020-05-12T23:20:17.381Z",
        "firedMessages": [
          "string"
        ],
        "priority": 0,
        "productBanner": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "promotionGroup": "string",
        "promotionType": "string",
        "restrictions": [
          {
            "description": "string",
            "restrictionType": "string"
          }
        ],
        "startDate": "2020-05-12T23:20:17.381Z",
        "title": "string"
      }
    }
  ],
  "appliedProductPromotions": [
    {
      "consumedEntries": [
        {
          "adjustedUnitPrice": 0,
          "code": "string",
          "orderEntryNumber": 0,
          "quantity": 0
        }
      ],
      "description": "string",
      "promotion": {
        "code": "string",
        "couldFireMessages": [
          "string"
        ],
        "description": "string",
        "enabled": true,
        "endDate": "2020-05-12T23:20:17.381Z",
        "firedMessages": [
          "string"
        ],
        "priority": 0,
        "productBanner": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "promotionGroup": "string",
        "promotionType": "string",
        "restrictions": [
          {
            "description": "string",
            "restrictionType": "string"
          }
        ],
        "startDate": "2020-05-12T23:20:17.381Z",
        "title": "string"
      }
    }
  ],
  "appliedVouchers": [
    {
      "appliedValue": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "code": "string",
      "currency": {
        "active": true,
        "isocode": "string",
        "name": "string",
        "symbol": "string"
      },
      "description": "string",
      "freeShipping": true,
      "name": "string",
      "value": 0,
      "valueFormatted": "string",
      "valueString": "string",
      "voucherCode": "string"
    }
  ],
  "calculated": true,
  "cancellable": true,
  "code": "string",
  "consignments": [
    {
      "code": "string",
      "deliveryPointOfService": {
        "address": {
          "cellphone": "string",
          "companyName": "string",
          "country": {
            "isocode": "string",
            "name": "string"
          },
          "defaultAddress": true,
          "district": "string",
          "email": "string",
          "firstName": "string",
          "formattedAddress": "string",
          "id": "string",
          "lastName": "string",
          "line1": "string",
          "line2": "string",
          "phone": "string",
          "postalCode": "string",
          "region": {
            "countryIso": "string",
            "isocode": "string",
            "isocodeShort": "string",
            "name": "string"
          },
          "shippingAddress": true,
          "title": "string",
          "titleCode": "string",
          "town": "string",
          "visibleInAddressBook": true
        },
        "description": "string",
        "displayName": "string",
        "distanceKm": 0,
        "features": {
          "additionalProp1": "string",
          "additionalProp2": "string",
          "additionalProp3": "string"
        },
        "formattedDistance": "string",
        "geoPoint": {
          "latitude": 0,
          "longitude": 0
        },
        "mapIcon": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "name": "string",
        "openingHours": {
          "code": "string",
          "name": "string",
          "specialDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "comment": "string",
              "date": "2020-05-12T23:20:17.382Z",
              "formattedDate": "string",
              "name": "string",
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              }
            }
          ],
          "weekDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "weekDay": "string"
            }
          ]
        },
        "storeContent": "string",
        "storeImages": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "url": "string"
      },
      "entries": [
        {
          "orderEntry": {
            "basePrice": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "cancellableQuantity": 5,
            "cancelledItemsPrice": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "configurationInfos": [
              {
                "configurationLabel": "string",
                "configurationValue": "string",
                "configuratorType": "string",
                "status": "string"
              }
            ],
            "deliveryMode": {
              "code": "string",
              "deliveryCost": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "description": "string",
              "name": "string"
            },
            "deliveryPointOfService": {
              "address": {
                "cellphone": "string",
                "companyName": "string",
                "country": {
                  "isocode": "string",
                  "name": "string"
                },
                "defaultAddress": true,
                "district": "string",
                "email": "string",
                "firstName": "string",
                "formattedAddress": "string",
                "id": "string",
                "lastName": "string",
                "line1": "string",
                "line2": "string",
                "phone": "string",
                "postalCode": "string",
                "region": {
                  "countryIso": "string",
                  "isocode": "string",
                  "isocodeShort": "string",
                  "name": "string"
                },
                "shippingAddress": true,
                "title": "string",
                "titleCode": "string",
                "town": "string",
                "visibleInAddressBook": true
              },
              "description": "string",
              "displayName": "string",
              "distanceKm": 0,
              "features": {
                "additionalProp1": "string",
                "additionalProp2": "string",
                "additionalProp3": "string"
              },
              "formattedDistance": "string",
              "geoPoint": {
                "latitude": 0,
                "longitude": 0
              },
              "mapIcon": {
                "altText": "string",
                "format": "string",
                "galleryIndex": 0,
                "imageType": "PRIMARY",
                "url": "string"
              },
              "name": "string",
              "openingHours": {
                "code": "string",
                "name": "string",
                "specialDayOpeningList": [
                  {
                    "closed": true,
                    "closingTime": {
                      "formattedHour": "string",
                      "hour": 0,
                      "minute": 0
                    },
                    "comment": "string",
                    "date": "2020-05-12T23:20:17.382Z",
                    "formattedDate": "string",
                    "name": "string",
                    "openingTime": {
                      "formattedHour": "string",
                      "hour": 0,
                      "minute": 0
                    }
                  }
                ],
                "weekDayOpeningList": [
                  {
                    "closed": true,
                    "closingTime": {
                      "formattedHour": "string",
                      "hour": 0,
                      "minute": 0
                    },
                    "openingTime": {
                      "formattedHour": "string",
                      "hour": 0,
                      "minute": 0
                    },
                    "weekDay": "string"
                  }
                ]
              },
              "storeContent": "string",
              "storeImages": [
                {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                }
              ],
              "url": "string"
            },
            "entryNumber": 0,
            "product": {
              "availableForPickup": true,
              "averageRating": 0,
              "baseOptions": [
                {
                  "options": [
                    {
                      "code": "string",
                      "priceData": {
                        "currencyIso": "string",
                        "formattedValue": "string",
                        "maxQuantity": 0,
                        "minQuantity": 0,
                        "priceType": "BUY",
                        "value": 0
                      },
                      "stock": {
                        "stockLevel": 0,
                        "stockLevelStatus": "string"
                      },
                      "url": "string",
                      "variantOptionQualifiers": [
                        {
                          "image": {
                            "altText": "string",
                            "format": "string",
                            "galleryIndex": 0,
                            "imageType": "PRIMARY",
                            "url": "string"
                          },
                          "name": "string",
                          "qualifier": "string",
                          "value": "string"
                        }
                      ]
                    }
                  ],
                  "selected": {
                    "code": "string",
                    "priceData": {
                      "currencyIso": "string",
                      "formattedValue": "string",
                      "maxQuantity": 0,
                      "minQuantity": 0,
                      "priceType": "BUY",
                      "value": 0
                    },
                    "stock": {
                      "stockLevel": 0,
                      "stockLevelStatus": "string"
                    },
                    "url": "string",
                    "variantOptionQualifiers": [
                      {
                        "image": {
                          "altText": "string",
                          "format": "string",
                          "galleryIndex": 0,
                          "imageType": "PRIMARY",
                          "url": "string"
                        },
                        "name": "string",
                        "qualifier": "string",
                        "value": "string"
                      }
                    ]
                  },
                  "variantType": "string"
                }
              ],
              "baseProduct": "string",
              "categories": [
                {
                  "code": "string",
                  "image": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "name": "string",
                  "url": "string"
                }
              ],
              "classifications": [
                {
                  "code": "string",
                  "features": [
                    {
                      "code": "string",
                      "comparable": true,
                      "description": "string",
                      "featureUnit": {
                        "name": "string",
                        "symbol": "string",
                        "unitType": "string"
                      },
                      "featureValues": [
                        {
                          "value": "string"
                        }
                      ],
                      "name": "string",
                      "range": true,
                      "type": "string"
                    }
                  ],
                  "name": "string"
                }
              ],
              "code": "string",
              "configurable": true,
              "configuratorType": "string",
              "description": "string",
              "futureStocks": [
                {
                  "date": "2020-05-12T23:20:17.383Z",
                  "formattedDate": "string",
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  }
                }
              ],
              "images": [
                {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                }
              ],
              "manufacturer": "string",
              "multidimensional": true,
              "name": "string",
              "numberOfReviews": 0,
              "potentialPromotions": [
                {
                  "code": "string",
                  "couldFireMessages": [
                    "string"
                  ],
                  "description": "string",
                  "enabled": true,
                  "endDate": "2020-05-12T23:20:17.383Z",
                  "firedMessages": [
                    "string"
                  ],
                  "priority": 0,
                  "productBanner": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "promotionGroup": "string",
                  "promotionType": "string",
                  "restrictions": [
                    {
                      "description": "string",
                      "restrictionType": "string"
                    }
                  ],
                  "startDate": "2020-05-12T23:20:17.383Z",
                  "title": "string"
                }
              ],
              "price": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "priceRange": {
                "maxPrice": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                },
                "minPrice": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                }
              },
              "productReferences": [
                {
                  "description": "string",
                  "preselected": true,
                  "quantity": 0,
                  "referenceType": "string"
                }
              ],
              "purchasable": true,
              "reviews": [
                {
                  "alias": "string",
                  "comment": "string",
                  "date": "2020-05-12T23:20:17.383Z",
                  "headline": "string",
                  "id": "string",
                  "principal": {
                    "currency": {
                      "active": true,
                      "isocode": "string",
                      "name": "string",
                      "symbol": "string"
                    },
                    "customerId": "string",
                    "deactivationDate": "2020-05-12T23:20:17.383Z",
                    "defaultAddress": {
                      "cellphone": "string",
                      "companyName": "string",
                      "country": {
                        "isocode": "string",
                        "name": "string"
                      },
                      "defaultAddress": true,
                      "district": "string",
                      "email": "string",
                      "firstName": "string",
                      "formattedAddress": "string",
                      "id": "string",
                      "lastName": "string",
                      "line1": "string",
                      "line2": "string",
                      "phone": "string",
                      "postalCode": "string",
                      "region": {
                        "countryIso": "string",
                        "isocode": "string",
                        "isocodeShort": "string",
                        "name": "string"
                      },
                      "shippingAddress": true,
                      "title": "string",
                      "titleCode": "string",
                      "town": "string",
                      "visibleInAddressBook": true
                    },
                    "displayUid": "string",
                    "firstName": "string",
                    "language": {
                      "active": true,
                      "isocode": "string",
                      "name": "string",
                      "nativeName": "string"
                    },
                    "lastName": "string",
                    "name": "string",
                    "title": "string",
                    "titleCode": "string",
                    "uid": "string"
                  },
                  "rating": 0
                }
              ],
              "stock": {
                "stockLevel": 0,
                "stockLevelStatus": "string"
              },
              "summary": "string",
              "tags": [
                "string"
              ],
              "url": "string",
              "variantMatrix": [
                {
                  "elements": [
                    null
                  ],
                  "isLeaf": true,
                  "parentVariantCategory": {
                    "hasImage": true,
                    "name": "string",
                    "priority": 0
                  },
                  "variantOption": {
                    "code": "string",
                    "priceData": {
                      "currencyIso": "string",
                      "formattedValue": "string",
                      "maxQuantity": 0,
                      "minQuantity": 0,
                      "priceType": "BUY",
                      "value": 0
                    },
                    "stock": {
                      "stockLevel": 0,
                      "stockLevelStatus": "string"
                    },
                    "url": "string",
                    "variantOptionQualifiers": [
                      {
                        "image": {
                          "altText": "string",
                          "format": "string",
                          "galleryIndex": 0,
                          "imageType": "PRIMARY",
                          "url": "string"
                        },
                        "name": "string",
                        "qualifier": "string",
                        "value": "string"
                      }
                    ]
                  },
                  "variantValueCategory": {
                    "name": "string",
                    "sequence": 0,
                    "superCategories": [
                      {
                        "hasImage": true,
                        "name": "string",
                        "priority": 0
                      }
                    ]
                  }
                }
              ],
              "variantOptions": [
                {
                  "code": "string",
                  "priceData": {
                    "currencyIso": "string",
                    "formattedValue": "string",
                    "maxQuantity": 0,
                    "minQuantity": 0,
                    "priceType": "BUY",
                    "value": 0
                  },
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  },
                  "url": "string",
                  "variantOptionQualifiers": [
                    {
                      "image": {
                        "altText": "string",
                        "format": "string",
                        "galleryIndex": 0,
                        "imageType": "PRIMARY",
                        "url": "string"
                      },
                      "name": "string",
                      "qualifier": "string",
                      "value": "string"
                    }
                  ]
                }
              ],
              "variantType": "string",
              "volumePrices": [
                {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                }
              ],
              "volumePricesFlag": true
            },
            "quantity": 0,
            "returnableQuantity": 5,
            "returnedItemsPrice": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "totalPrice": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "updateable": true
          },
          "quantity": 0,
          "shippedQuantity": 0
        }
      ],
      "shippingAddress": {
        "cellphone": "string",
        "companyName": "string",
        "country": {
          "isocode": "string",
          "name": "string"
        },
        "defaultAddress": true,
        "district": "string",
        "email": "string",
        "firstName": "string",
        "formattedAddress": "string",
        "id": "string",
        "lastName": "string",
        "line1": "string",
        "line2": "string",
        "phone": "string",
        "postalCode": "string",
        "region": {
          "countryIso": "string",
          "isocode": "string",
          "isocodeShort": "string",
          "name": "string"
        },
        "shippingAddress": true,
        "title": "string",
        "titleCode": "string",
        "town": "string",
        "visibleInAddressBook": true
      },
      "status": "string",
      "statusDate": "2020-05-12T23:20:17.384Z",
      "statusDisplay": "string",
      "trackingID": "string"
    }
  ],
  "created": "2020-05-12T23:20:17.384Z",
  "deliveryAddress": {
    "cellphone": "string",
    "companyName": "string",
    "country": {
      "isocode": "string",
      "name": "string"
    },
    "defaultAddress": true,
    "district": "string",
    "email": "string",
    "firstName": "string",
    "formattedAddress": "string",
    "id": "string",
    "lastName": "string",
    "line1": "string",
    "line2": "string",
    "phone": "string",
    "postalCode": "string",
    "region": {
      "countryIso": "string",
      "isocode": "string",
      "isocodeShort": "string",
      "name": "string"
    },
    "shippingAddress": true,
    "title": "string",
    "titleCode": "string",
    "town": "string",
    "visibleInAddressBook": true
  },
  "deliveryCost": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "deliveryItemsQuantity": 0,
  "deliveryMode": {
    "code": "string",
    "deliveryCost": {
      "currencyIso": "string",
      "formattedValue": "string",
      "maxQuantity": 0,
      "minQuantity": 0,
      "priceType": "BUY",
      "value": 0
    },
    "description": "string",
    "name": "string"
  },
  "deliveryOrderGroups": [
    {
      "deliveryAddress": {
        "cellphone": "string",
        "companyName": "string",
        "country": {
          "isocode": "string",
          "name": "string"
        },
        "defaultAddress": true,
        "district": "string",
        "email": "string",
        "firstName": "string",
        "formattedAddress": "string",
        "id": "string",
        "lastName": "string",
        "line1": "string",
        "line2": "string",
        "phone": "string",
        "postalCode": "string",
        "region": {
          "countryIso": "string",
          "isocode": "string",
          "isocodeShort": "string",
          "name": "string"
        },
        "shippingAddress": true,
        "title": "string",
        "titleCode": "string",
        "town": "string",
        "visibleInAddressBook": true
      },
      "entries": [
        {
          "basePrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "cancellableQuantity": 5,
          "cancelledItemsPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "configurationInfos": [
            {
              "configurationLabel": "string",
              "configurationValue": "string",
              "configuratorType": "string",
              "status": "string"
            }
          ],
          "deliveryMode": {
            "code": "string",
            "deliveryCost": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "description": "string",
            "name": "string"
          },
          "deliveryPointOfService": {
            "address": {
              "cellphone": "string",
              "companyName": "string",
              "country": {
                "isocode": "string",
                "name": "string"
              },
              "defaultAddress": true,
              "district": "string",
              "email": "string",
              "firstName": "string",
              "formattedAddress": "string",
              "id": "string",
              "lastName": "string",
              "line1": "string",
              "line2": "string",
              "phone": "string",
              "postalCode": "string",
              "region": {
                "countryIso": "string",
                "isocode": "string",
                "isocodeShort": "string",
                "name": "string"
              },
              "shippingAddress": true,
              "title": "string",
              "titleCode": "string",
              "town": "string",
              "visibleInAddressBook": true
            },
            "description": "string",
            "displayName": "string",
            "distanceKm": 0,
            "features": {
              "additionalProp1": "string",
              "additionalProp2": "string",
              "additionalProp3": "string"
            },
            "formattedDistance": "string",
            "geoPoint": {
              "latitude": 0,
              "longitude": 0
            },
            "mapIcon": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "name": "string",
            "openingHours": {
              "code": "string",
              "name": "string",
              "specialDayOpeningList": [
                {
                  "closed": true,
                  "closingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "comment": "string",
                  "date": "2020-05-12T23:20:17.384Z",
                  "formattedDate": "string",
                  "name": "string",
                  "openingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  }
                }
              ],
              "weekDayOpeningList": [
                {
                  "closed": true,
                  "closingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "openingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "weekDay": "string"
                }
              ]
            },
            "storeContent": "string",
            "storeImages": [
              {
                "altText": "string",
                "format": "string",
                "galleryIndex": 0,
                "imageType": "PRIMARY",
                "url": "string"
              }
            ],
            "url": "string"
          },
          "entryNumber": 0,
          "product": {
            "availableForPickup": true,
            "averageRating": 0,
            "baseOptions": [
              {
                "options": [
                  {
                    "code": "string",
                    "priceData": {
                      "currencyIso": "string",
                      "formattedValue": "string",
                      "maxQuantity": 0,
                      "minQuantity": 0,
                      "priceType": "BUY",
                      "value": 0
                    },
                    "stock": {
                      "stockLevel": 0,
                      "stockLevelStatus": "string"
                    },
                    "url": "string",
                    "variantOptionQualifiers": [
                      {
                        "image": {
                          "altText": "string",
                          "format": "string",
                          "galleryIndex": 0,
                          "imageType": "PRIMARY",
                          "url": "string"
                        },
                        "name": "string",
                        "qualifier": "string",
                        "value": "string"
                      }
                    ]
                  }
                ],
                "selected": {
                  "code": "string",
                  "priceData": {
                    "currencyIso": "string",
                    "formattedValue": "string",
                    "maxQuantity": 0,
                    "minQuantity": 0,
                    "priceType": "BUY",
                    "value": 0
                  },
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  },
                  "url": "string",
                  "variantOptionQualifiers": [
                    {
                      "image": {
                        "altText": "string",
                        "format": "string",
                        "galleryIndex": 0,
                        "imageType": "PRIMARY",
                        "url": "string"
                      },
                      "name": "string",
                      "qualifier": "string",
                      "value": "string"
                    }
                  ]
                },
                "variantType": "string"
              }
            ],
            "baseProduct": "string",
            "categories": [
              {
                "code": "string",
                "image": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "name": "string",
                "url": "string"
              }
            ],
            "classifications": [
              {
                "code": "string",
                "features": [
                  {
                    "code": "string",
                    "comparable": true,
                    "description": "string",
                    "featureUnit": {
                      "name": "string",
                      "symbol": "string",
                      "unitType": "string"
                    },
                    "featureValues": [
                      {
                        "value": "string"
                      }
                    ],
                    "name": "string",
                    "range": true,
                    "type": "string"
                  }
                ],
                "name": "string"
              }
            ],
            "code": "string",
            "configurable": true,
            "configuratorType": "string",
            "description": "string",
            "futureStocks": [
              {
                "date": "2020-05-12T23:20:17.384Z",
                "formattedDate": "string",
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                }
              }
            ],
            "images": [
              {
                "altText": "string",
                "format": "string",
                "galleryIndex": 0,
                "imageType": "PRIMARY",
                "url": "string"
              }
            ],
            "manufacturer": "string",
            "multidimensional": true,
            "name": "string",
            "numberOfReviews": 0,
            "potentialPromotions": [
              {
                "code": "string",
                "couldFireMessages": [
                  "string"
                ],
                "description": "string",
                "enabled": true,
                "endDate": "2020-05-12T23:20:17.384Z",
                "firedMessages": [
                  "string"
                ],
                "priority": 0,
                "productBanner": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "promotionGroup": "string",
                "promotionType": "string",
                "restrictions": [
                  {
                    "description": "string",
                    "restrictionType": "string"
                  }
                ],
                "startDate": "2020-05-12T23:20:17.384Z",
                "title": "string"
              }
            ],
            "price": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "priceRange": {
              "maxPrice": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "minPrice": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              }
            },
            "productReferences": [
              {
                "description": "string",
                "preselected": true,
                "quantity": 0,
                "referenceType": "string"
              }
            ],
            "purchasable": true,
            "reviews": [
              {
                "alias": "string",
                "comment": "string",
                "date": "2020-05-12T23:20:17.384Z",
                "headline": "string",
                "id": "string",
                "principal": {
                  "currency": {
                    "active": true,
                    "isocode": "string",
                    "name": "string",
                    "symbol": "string"
                  },
                  "customerId": "string",
                  "deactivationDate": "2020-05-12T23:20:17.384Z",
                  "defaultAddress": {
                    "cellphone": "string",
                    "companyName": "string",
                    "country": {
                      "isocode": "string",
                      "name": "string"
                    },
                    "defaultAddress": true,
                    "district": "string",
                    "email": "string",
                    "firstName": "string",
                    "formattedAddress": "string",
                    "id": "string",
                    "lastName": "string",
                    "line1": "string",
                    "line2": "string",
                    "phone": "string",
                    "postalCode": "string",
                    "region": {
                      "countryIso": "string",
                      "isocode": "string",
                      "isocodeShort": "string",
                      "name": "string"
                    },
                    "shippingAddress": true,
                    "title": "string",
                    "titleCode": "string",
                    "town": "string",
                    "visibleInAddressBook": true
                  },
                  "displayUid": "string",
                  "firstName": "string",
                  "language": {
                    "active": true,
                    "isocode": "string",
                    "name": "string",
                    "nativeName": "string"
                  },
                  "lastName": "string",
                  "name": "string",
                  "title": "string",
                  "titleCode": "string",
                  "uid": "string"
                },
                "rating": 0
              }
            ],
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            },
            "summary": "string",
            "tags": [
              "string"
            ],
            "url": "string",
            "variantMatrix": [
              {
                "elements": [
                  null
                ],
                "isLeaf": true,
                "parentVariantCategory": {
                  "hasImage": true,
                  "name": "string",
                  "priority": 0
                },
                "variantOption": {
                  "code": "string",
                  "priceData": {
                    "currencyIso": "string",
                    "formattedValue": "string",
                    "maxQuantity": 0,
                    "minQuantity": 0,
                    "priceType": "BUY",
                    "value": 0
                  },
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  },
                  "url": "string",
                  "variantOptionQualifiers": [
                    {
                      "image": {
                        "altText": "string",
                        "format": "string",
                        "galleryIndex": 0,
                        "imageType": "PRIMARY",
                        "url": "string"
                      },
                      "name": "string",
                      "qualifier": "string",
                      "value": "string"
                    }
                  ]
                },
                "variantValueCategory": {
                  "name": "string",
                  "sequence": 0,
                  "superCategories": [
                    {
                      "hasImage": true,
                      "name": "string",
                      "priority": 0
                    }
                  ]
                }
              }
            ],
            "variantOptions": [
              {
                "code": "string",
                "priceData": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                },
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                },
                "url": "string",
                "variantOptionQualifiers": [
                  {
                    "image": {
                      "altText": "string",
                      "format": "string",
                      "galleryIndex": 0,
                      "imageType": "PRIMARY",
                      "url": "string"
                    },
                    "name": "string",
                    "qualifier": "string",
                    "value": "string"
                  }
                ]
              }
            ],
            "variantType": "string",
            "volumePrices": [
              {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              }
            ],
            "volumePricesFlag": true
          },
          "quantity": 0,
          "returnableQuantity": 5,
          "returnedItemsPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "totalPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "updateable": true
        }
      ],
      "quantity": 0,
      "totalPriceWithTax": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      }
    }
  ],
  "deliveryStatus": "string",
  "deliveryStatusDisplay": "string",
  "entries": [
    {
      "basePrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "cancellableQuantity": 5,
      "cancelledItemsPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "configurationInfos": [
        {
          "configurationLabel": "string",
          "configurationValue": "string",
          "configuratorType": "string",
          "status": "string"
        }
      ],
      "deliveryMode": {
        "code": "string",
        "deliveryCost": {
          "currencyIso": "string",
          "formattedValue": "string",
          "maxQuantity": 0,
          "minQuantity": 0,
          "priceType": "BUY",
          "value": 0
        },
        "description": "string",
        "name": "string"
      },
      "deliveryPointOfService": {
        "address": {
          "cellphone": "string",
          "companyName": "string",
          "country": {
            "isocode": "string",
            "name": "string"
          },
          "defaultAddress": true,
          "district": "string",
          "email": "string",
          "firstName": "string",
          "formattedAddress": "string",
          "id": "string",
          "lastName": "string",
          "line1": "string",
          "line2": "string",
          "phone": "string",
          "postalCode": "string",
          "region": {
            "countryIso": "string",
            "isocode": "string",
            "isocodeShort": "string",
            "name": "string"
          },
          "shippingAddress": true,
          "title": "string",
          "titleCode": "string",
          "town": "string",
          "visibleInAddressBook": true
        },
        "description": "string",
        "displayName": "string",
        "distanceKm": 0,
        "features": {
          "additionalProp1": "string",
          "additionalProp2": "string",
          "additionalProp3": "string"
        },
        "formattedDistance": "string",
        "geoPoint": {
          "latitude": 0,
          "longitude": 0
        },
        "mapIcon": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "name": "string",
        "openingHours": {
          "code": "string",
          "name": "string",
          "specialDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "comment": "string",
              "date": "2020-05-12T23:20:17.385Z",
              "formattedDate": "string",
              "name": "string",
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              }
            }
          ],
          "weekDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "weekDay": "string"
            }
          ]
        },
        "storeContent": "string",
        "storeImages": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "url": "string"
      },
      "entryNumber": 0,
      "product": {
        "availableForPickup": true,
        "averageRating": 0,
        "baseOptions": [
          {
            "options": [
              {
                "code": "string",
                "priceData": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                },
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                },
                "url": "string",
                "variantOptionQualifiers": [
                  {
                    "image": {
                      "altText": "string",
                      "format": "string",
                      "galleryIndex": 0,
                      "imageType": "PRIMARY",
                      "url": "string"
                    },
                    "name": "string",
                    "qualifier": "string",
                    "value": "string"
                  }
                ]
              }
            ],
            "selected": {
              "code": "string",
              "priceData": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "stock": {
                "stockLevel": 0,
                "stockLevelStatus": "string"
              },
              "url": "string",
              "variantOptionQualifiers": [
                {
                  "image": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "name": "string",
                  "qualifier": "string",
                  "value": "string"
                }
              ]
            },
            "variantType": "string"
          }
        ],
        "baseProduct": "string",
        "categories": [
          {
            "code": "string",
            "image": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "name": "string",
            "url": "string"
          }
        ],
        "classifications": [
          {
            "code": "string",
            "features": [
              {
                "code": "string",
                "comparable": true,
                "description": "string",
                "featureUnit": {
                  "name": "string",
                  "symbol": "string",
                  "unitType": "string"
                },
                "featureValues": [
                  {
                    "value": "string"
                  }
                ],
                "name": "string",
                "range": true,
                "type": "string"
              }
            ],
            "name": "string"
          }
        ],
        "code": "string",
        "configurable": true,
        "configuratorType": "string",
        "description": "string",
        "futureStocks": [
          {
            "date": "2020-05-12T23:20:17.385Z",
            "formattedDate": "string",
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            }
          }
        ],
        "images": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "manufacturer": "string",
        "multidimensional": true,
        "name": "string",
        "numberOfReviews": 0,
        "potentialPromotions": [
          {
            "code": "string",
            "couldFireMessages": [
              "string"
            ],
            "description": "string",
            "enabled": true,
            "endDate": "2020-05-12T23:20:17.385Z",
            "firedMessages": [
              "string"
            ],
            "priority": 0,
            "productBanner": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "promotionGroup": "string",
            "promotionType": "string",
            "restrictions": [
              {
                "description": "string",
                "restrictionType": "string"
              }
            ],
            "startDate": "2020-05-12T23:20:17.385Z",
            "title": "string"
          }
        ],
        "price": {
          "currencyIso": "string",
          "formattedValue": "string",
          "maxQuantity": 0,
          "minQuantity": 0,
          "priceType": "BUY",
          "value": 0
        },
        "priceRange": {
          "maxPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "minPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          }
        },
        "productReferences": [
          {
            "description": "string",
            "preselected": true,
            "quantity": 0,
            "referenceType": "string"
          }
        ],
        "purchasable": true,
        "reviews": [
          {
            "alias": "string",
            "comment": "string",
            "date": "2020-05-12T23:20:17.385Z",
            "headline": "string",
            "id": "string",
            "principal": {
              "currency": {
                "active": true,
                "isocode": "string",
                "name": "string",
                "symbol": "string"
              },
              "customerId": "string",
              "deactivationDate": "2020-05-12T23:20:17.385Z",
              "defaultAddress": {
                "cellphone": "string",
                "companyName": "string",
                "country": {
                  "isocode": "string",
                  "name": "string"
                },
                "defaultAddress": true,
                "district": "string",
                "email": "string",
                "firstName": "string",
                "formattedAddress": "string",
                "id": "string",
                "lastName": "string",
                "line1": "string",
                "line2": "string",
                "phone": "string",
                "postalCode": "string",
                "region": {
                  "countryIso": "string",
                  "isocode": "string",
                  "isocodeShort": "string",
                  "name": "string"
                },
                "shippingAddress": true,
                "title": "string",
                "titleCode": "string",
                "town": "string",
                "visibleInAddressBook": true
              },
              "displayUid": "string",
              "firstName": "string",
              "language": {
                "active": true,
                "isocode": "string",
                "name": "string",
                "nativeName": "string"
              },
              "lastName": "string",
              "name": "string",
              "title": "string",
              "titleCode": "string",
              "uid": "string"
            },
            "rating": 0
          }
        ],
        "stock": {
          "stockLevel": 0,
          "stockLevelStatus": "string"
        },
        "summary": "string",
        "tags": [
          "string"
        ],
        "url": "string",
        "variantMatrix": [
          {
            "elements": [
              null
            ],
            "isLeaf": true,
            "parentVariantCategory": {
              "hasImage": true,
              "name": "string",
              "priority": 0
            },
            "variantOption": {
              "code": "string",
              "priceData": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "stock": {
                "stockLevel": 0,
                "stockLevelStatus": "string"
              },
              "url": "string",
              "variantOptionQualifiers": [
                {
                  "image": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "name": "string",
                  "qualifier": "string",
                  "value": "string"
                }
              ]
            },
            "variantValueCategory": {
              "name": "string",
              "sequence": 0,
              "superCategories": [
                {
                  "hasImage": true,
                  "name": "string",
                  "priority": 0
                }
              ]
            }
          }
        ],
        "variantOptions": [
          {
            "code": "string",
            "priceData": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            },
            "url": "string",
            "variantOptionQualifiers": [
              {
                "image": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "name": "string",
                "qualifier": "string",
                "value": "string"
              }
            ]
          }
        ],
        "variantType": "string",
        "volumePrices": [
          {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          }
        ],
        "volumePricesFlag": true
      },
      "quantity": 0,
      "returnableQuantity": 5,
      "returnedItemsPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "totalPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "updateable": true
    }
  ],
  "guestCustomer": true,
  "guid": "string",
  "net": true,
  "orderDiscounts": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "paymentInfo": {
    "accountHolderName": "string",
    "billingAddress": {
      "cellphone": "string",
      "companyName": "string",
      "country": {
        "isocode": "string",
        "name": "string"
      },
      "defaultAddress": true,
      "district": "string",
      "email": "string",
      "firstName": "string",
      "formattedAddress": "string",
      "id": "string",
      "lastName": "string",
      "line1": "string",
      "line2": "string",
      "phone": "string",
      "postalCode": "string",
      "region": {
        "countryIso": "string",
        "isocode": "string",
        "isocodeShort": "string",
        "name": "string"
      },
      "shippingAddress": true,
      "title": "string",
      "titleCode": "string",
      "town": "string",
      "visibleInAddressBook": true
    },
    "cardNumber": "string",
    "cardType": {
      "code": "string",
      "name": "string"
    },
    "defaultPayment": true,
    "expiryMonth": "string",
    "expiryYear": "string",
    "id": "string",
    "issueNumber": "string",
    "saved": true,
    "startMonth": "string",
    "startYear": "string",
    "subscriptionId": "string"
  },
  "pickupItemsQuantity": 0,
  "pickupOrderGroups": [
    {
      "deliveryPointOfService": {
        "address": {
          "cellphone": "string",
          "companyName": "string",
          "country": {
            "isocode": "string",
            "name": "string"
          },
          "defaultAddress": true,
          "district": "string",
          "email": "string",
          "firstName": "string",
          "formattedAddress": "string",
          "id": "string",
          "lastName": "string",
          "line1": "string",
          "line2": "string",
          "phone": "string",
          "postalCode": "string",
          "region": {
            "countryIso": "string",
            "isocode": "string",
            "isocodeShort": "string",
            "name": "string"
          },
          "shippingAddress": true,
          "title": "string",
          "titleCode": "string",
          "town": "string",
          "visibleInAddressBook": true
        },
        "description": "string",
        "displayName": "string",
        "distanceKm": 0,
        "features": {
          "additionalProp1": "string",
          "additionalProp2": "string",
          "additionalProp3": "string"
        },
        "formattedDistance": "string",
        "geoPoint": {
          "latitude": 0,
          "longitude": 0
        },
        "mapIcon": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "name": "string",
        "openingHours": {
          "code": "string",
          "name": "string",
          "specialDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "comment": "string",
              "date": "2020-05-12T23:20:17.386Z",
              "formattedDate": "string",
              "name": "string",
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              }
            }
          ],
          "weekDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "weekDay": "string"
            }
          ]
        },
        "storeContent": "string",
        "storeImages": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "url": "string"
      },
      "distance": 0,
      "entries": [
        {
          "basePrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "cancellableQuantity": 5,
          "cancelledItemsPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "configurationInfos": [
            {
              "configurationLabel": "string",
              "configurationValue": "string",
              "configuratorType": "string",
              "status": "string"
            }
          ],
          "deliveryMode": {
            "code": "string",
            "deliveryCost": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "description": "string",
            "name": "string"
          },
          "deliveryPointOfService": {
            "address": {
              "cellphone": "string",
              "companyName": "string",
              "country": {
                "isocode": "string",
                "name": "string"
              },
              "defaultAddress": true,
              "district": "string",
              "email": "string",
              "firstName": "string",
              "formattedAddress": "string",
              "id": "string",
              "lastName": "string",
              "line1": "string",
              "line2": "string",
              "phone": "string",
              "postalCode": "string",
              "region": {
                "countryIso": "string",
                "isocode": "string",
                "isocodeShort": "string",
                "name": "string"
              },
              "shippingAddress": true,
              "title": "string",
              "titleCode": "string",
              "town": "string",
              "visibleInAddressBook": true
            },
            "description": "string",
            "displayName": "string",
            "distanceKm": 0,
            "features": {
              "additionalProp1": "string",
              "additionalProp2": "string",
              "additionalProp3": "string"
            },
            "formattedDistance": "string",
            "geoPoint": {
              "latitude": 0,
              "longitude": 0
            },
            "mapIcon": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "name": "string",
            "openingHours": {
              "code": "string",
              "name": "string",
              "specialDayOpeningList": [
                {
                  "closed": true,
                  "closingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "comment": "string",
                  "date": "2020-05-12T23:20:17.389Z",
                  "formattedDate": "string",
                  "name": "string",
                  "openingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  }
                }
              ],
              "weekDayOpeningList": [
                {
                  "closed": true,
                  "closingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "openingTime": {
                    "formattedHour": "string",
                    "hour": 0,
                    "minute": 0
                  },
                  "weekDay": "string"
                }
              ]
            },
            "storeContent": "string",
            "storeImages": [
              {
                "altText": "string",
                "format": "string",
                "galleryIndex": 0,
                "imageType": "PRIMARY",
                "url": "string"
              }
            ],
            "url": "string"
          },
          "entryNumber": 0,
          "product": {
            "availableForPickup": true,
            "averageRating": 0,
            "baseOptions": [
              {
                "options": [
                  {
                    "code": "string",
                    "priceData": {
                      "currencyIso": "string",
                      "formattedValue": "string",
                      "maxQuantity": 0,
                      "minQuantity": 0,
                      "priceType": "BUY",
                      "value": 0
                    },
                    "stock": {
                      "stockLevel": 0,
                      "stockLevelStatus": "string"
                    },
                    "url": "string",
                    "variantOptionQualifiers": [
                      {
                        "image": {
                          "altText": "string",
                          "format": "string",
                          "galleryIndex": 0,
                          "imageType": "PRIMARY",
                          "url": "string"
                        },
                        "name": "string",
                        "qualifier": "string",
                        "value": "string"
                      }
                    ]
                  }
                ],
                "selected": {
                  "code": "string",
                  "priceData": {
                    "currencyIso": "string",
                    "formattedValue": "string",
                    "maxQuantity": 0,
                    "minQuantity": 0,
                    "priceType": "BUY",
                    "value": 0
                  },
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  },
                  "url": "string",
                  "variantOptionQualifiers": [
                    {
                      "image": {
                        "altText": "string",
                        "format": "string",
                        "galleryIndex": 0,
                        "imageType": "PRIMARY",
                        "url": "string"
                      },
                      "name": "string",
                      "qualifier": "string",
                      "value": "string"
                    }
                  ]
                },
                "variantType": "string"
              }
            ],
            "baseProduct": "string",
            "categories": [
              {
                "code": "string",
                "image": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "name": "string",
                "url": "string"
              }
            ],
            "classifications": [
              {
                "code": "string",
                "features": [
                  {
                    "code": "string",
                    "comparable": true,
                    "description": "string",
                    "featureUnit": {
                      "name": "string",
                      "symbol": "string",
                      "unitType": "string"
                    },
                    "featureValues": [
                      {
                        "value": "string"
                      }
                    ],
                    "name": "string",
                    "range": true,
                    "type": "string"
                  }
                ],
                "name": "string"
              }
            ],
            "code": "string",
            "configurable": true,
            "configuratorType": "string",
            "description": "string",
            "futureStocks": [
              {
                "date": "2020-05-12T23:20:17.389Z",
                "formattedDate": "string",
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                }
              }
            ],
            "images": [
              {
                "altText": "string",
                "format": "string",
                "galleryIndex": 0,
                "imageType": "PRIMARY",
                "url": "string"
              }
            ],
            "manufacturer": "string",
            "multidimensional": true,
            "name": "string",
            "numberOfReviews": 0,
            "potentialPromotions": [
              {
                "code": "string",
                "couldFireMessages": [
                  "string"
                ],
                "description": "string",
                "enabled": true,
                "endDate": "2020-05-12T23:20:17.389Z",
                "firedMessages": [
                  "string"
                ],
                "priority": 0,
                "productBanner": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "promotionGroup": "string",
                "promotionType": "string",
                "restrictions": [
                  {
                    "description": "string",
                    "restrictionType": "string"
                  }
                ],
                "startDate": "2020-05-12T23:20:17.389Z",
                "title": "string"
              }
            ],
            "price": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "priceRange": {
              "maxPrice": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "minPrice": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              }
            },
            "productReferences": [
              {
                "description": "string",
                "preselected": true,
                "quantity": 0,
                "referenceType": "string"
              }
            ],
            "purchasable": true,
            "reviews": [
              {
                "alias": "string",
                "comment": "string",
                "date": "2020-05-12T23:20:17.389Z",
                "headline": "string",
                "id": "string",
                "principal": {
                  "currency": {
                    "active": true,
                    "isocode": "string",
                    "name": "string",
                    "symbol": "string"
                  },
                  "customerId": "string",
                  "deactivationDate": "2020-05-12T23:20:17.390Z",
                  "defaultAddress": {
                    "cellphone": "string",
                    "companyName": "string",
                    "country": {
                      "isocode": "string",
                      "name": "string"
                    },
                    "defaultAddress": true,
                    "district": "string",
                    "email": "string",
                    "firstName": "string",
                    "formattedAddress": "string",
                    "id": "string",
                    "lastName": "string",
                    "line1": "string",
                    "line2": "string",
                    "phone": "string",
                    "postalCode": "string",
                    "region": {
                      "countryIso": "string",
                      "isocode": "string",
                      "isocodeShort": "string",
                      "name": "string"
                    },
                    "shippingAddress": true,
                    "title": "string",
                    "titleCode": "string",
                    "town": "string",
                    "visibleInAddressBook": true
                  },
                  "displayUid": "string",
                  "firstName": "string",
                  "language": {
                    "active": true,
                    "isocode": "string",
                    "name": "string",
                    "nativeName": "string"
                  },
                  "lastName": "string",
                  "name": "string",
                  "title": "string",
                  "titleCode": "string",
                  "uid": "string"
                },
                "rating": 0
              }
            ],
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            },
            "summary": "string",
            "tags": [
              "string"
            ],
            "url": "string",
            "variantMatrix": [
              {
                "elements": [
                  null
                ],
                "isLeaf": true,
                "parentVariantCategory": {
                  "hasImage": true,
                  "name": "string",
                  "priority": 0
                },
                "variantOption": {
                  "code": "string",
                  "priceData": {
                    "currencyIso": "string",
                    "formattedValue": "string",
                    "maxQuantity": 0,
                    "minQuantity": 0,
                    "priceType": "BUY",
                    "value": 0
                  },
                  "stock": {
                    "stockLevel": 0,
                    "stockLevelStatus": "string"
                  },
                  "url": "string",
                  "variantOptionQualifiers": [
                    {
                      "image": {
                        "altText": "string",
                        "format": "string",
                        "galleryIndex": 0,
                        "imageType": "PRIMARY",
                        "url": "string"
                      },
                      "name": "string",
                      "qualifier": "string",
                      "value": "string"
                    }
                  ]
                },
                "variantValueCategory": {
                  "name": "string",
                  "sequence": 0,
                  "superCategories": [
                    {
                      "hasImage": true,
                      "name": "string",
                      "priority": 0
                    }
                  ]
                }
              }
            ],
            "variantOptions": [
              {
                "code": "string",
                "priceData": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                },
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                },
                "url": "string",
                "variantOptionQualifiers": [
                  {
                    "image": {
                      "altText": "string",
                      "format": "string",
                      "galleryIndex": 0,
                      "imageType": "PRIMARY",
                      "url": "string"
                    },
                    "name": "string",
                    "qualifier": "string",
                    "value": "string"
                  }
                ]
              }
            ],
            "variantType": "string",
            "volumePrices": [
              {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              }
            ],
            "volumePricesFlag": true
          },
          "quantity": 0,
          "returnableQuantity": 5,
          "returnedItemsPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "totalPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "updateable": true
        }
      ],
      "quantity": 0,
      "totalPriceWithTax": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      }
    }
  ],
  "productDiscounts": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "returnable": true,
  "site": "string",
  "status": "string",
  "statusDisplay": "string",
  "store": "string",
  "subTotal": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "totalDiscounts": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "totalItems": 0,
  "totalPrice": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "totalPriceWithTax": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "totalTax": {
    "currencyIso": "string",
    "formattedValue": "string",
    "maxQuantity": 0,
    "minQuantity": 0,
    "priceType": "BUY",
    "value": 0
  },
  "unconsignedEntries": [
    {
      "basePrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "cancellableQuantity": 5,
      "cancelledItemsPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "configurationInfos": [
        {
          "configurationLabel": "string",
          "configurationValue": "string",
          "configuratorType": "string",
          "status": "string"
        }
      ],
      "deliveryMode": {
        "code": "string",
        "deliveryCost": {
          "currencyIso": "string",
          "formattedValue": "string",
          "maxQuantity": 0,
          "minQuantity": 0,
          "priceType": "BUY",
          "value": 0
        },
        "description": "string",
        "name": "string"
      },
      "deliveryPointOfService": {
        "address": {
          "cellphone": "string",
          "companyName": "string",
          "country": {
            "isocode": "string",
            "name": "string"
          },
          "defaultAddress": true,
          "district": "string",
          "email": "string",
          "firstName": "string",
          "formattedAddress": "string",
          "id": "string",
          "lastName": "string",
          "line1": "string",
          "line2": "string",
          "phone": "string",
          "postalCode": "string",
          "region": {
            "countryIso": "string",
            "isocode": "string",
            "isocodeShort": "string",
            "name": "string"
          },
          "shippingAddress": true,
          "title": "string",
          "titleCode": "string",
          "town": "string",
          "visibleInAddressBook": true
        },
        "description": "string",
        "displayName": "string",
        "distanceKm": 0,
        "features": {
          "additionalProp1": "string",
          "additionalProp2": "string",
          "additionalProp3": "string"
        },
        "formattedDistance": "string",
        "geoPoint": {
          "latitude": 0,
          "longitude": 0
        },
        "mapIcon": {
          "altText": "string",
          "format": "string",
          "galleryIndex": 0,
          "imageType": "PRIMARY",
          "url": "string"
        },
        "name": "string",
        "openingHours": {
          "code": "string",
          "name": "string",
          "specialDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "comment": "string",
              "date": "2020-05-12T23:20:17.390Z",
              "formattedDate": "string",
              "name": "string",
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              }
            }
          ],
          "weekDayOpeningList": [
            {
              "closed": true,
              "closingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "openingTime": {
                "formattedHour": "string",
                "hour": 0,
                "minute": 0
              },
              "weekDay": "string"
            }
          ]
        },
        "storeContent": "string",
        "storeImages": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "url": "string"
      },
      "entryNumber": 0,
      "product": {
        "availableForPickup": true,
        "averageRating": 0,
        "baseOptions": [
          {
            "options": [
              {
                "code": "string",
                "priceData": {
                  "currencyIso": "string",
                  "formattedValue": "string",
                  "maxQuantity": 0,
                  "minQuantity": 0,
                  "priceType": "BUY",
                  "value": 0
                },
                "stock": {
                  "stockLevel": 0,
                  "stockLevelStatus": "string"
                },
                "url": "string",
                "variantOptionQualifiers": [
                  {
                    "image": {
                      "altText": "string",
                      "format": "string",
                      "galleryIndex": 0,
                      "imageType": "PRIMARY",
                      "url": "string"
                    },
                    "name": "string",
                    "qualifier": "string",
                    "value": "string"
                  }
                ]
              }
            ],
            "selected": {
              "code": "string",
              "priceData": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "stock": {
                "stockLevel": 0,
                "stockLevelStatus": "string"
              },
              "url": "string",
              "variantOptionQualifiers": [
                {
                  "image": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "name": "string",
                  "qualifier": "string",
                  "value": "string"
                }
              ]
            },
            "variantType": "string"
          }
        ],
        "baseProduct": "string",
        "categories": [
          {
            "code": "string",
            "image": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "name": "string",
            "url": "string"
          }
        ],
        "classifications": [
          {
            "code": "string",
            "features": [
              {
                "code": "string",
                "comparable": true,
                "description": "string",
                "featureUnit": {
                  "name": "string",
                  "symbol": "string",
                  "unitType": "string"
                },
                "featureValues": [
                  {
                    "value": "string"
                  }
                ],
                "name": "string",
                "range": true,
                "type": "string"
              }
            ],
            "name": "string"
          }
        ],
        "code": "string",
        "configurable": true,
        "configuratorType": "string",
        "description": "string",
        "futureStocks": [
          {
            "date": "2020-05-12T23:20:17.390Z",
            "formattedDate": "string",
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            }
          }
        ],
        "images": [
          {
            "altText": "string",
            "format": "string",
            "galleryIndex": 0,
            "imageType": "PRIMARY",
            "url": "string"
          }
        ],
        "manufacturer": "string",
        "multidimensional": true,
        "name": "string",
        "numberOfReviews": 0,
        "potentialPromotions": [
          {
            "code": "string",
            "couldFireMessages": [
              "string"
            ],
            "description": "string",
            "enabled": true,
            "endDate": "2020-05-12T23:20:17.390Z",
            "firedMessages": [
              "string"
            ],
            "priority": 0,
            "productBanner": {
              "altText": "string",
              "format": "string",
              "galleryIndex": 0,
              "imageType": "PRIMARY",
              "url": "string"
            },
            "promotionGroup": "string",
            "promotionType": "string",
            "restrictions": [
              {
                "description": "string",
                "restrictionType": "string"
              }
            ],
            "startDate": "2020-05-12T23:20:17.390Z",
            "title": "string"
          }
        ],
        "price": {
          "currencyIso": "string",
          "formattedValue": "string",
          "maxQuantity": 0,
          "minQuantity": 0,
          "priceType": "BUY",
          "value": 0
        },
        "priceRange": {
          "maxPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          },
          "minPrice": {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          }
        },
        "productReferences": [
          {
            "description": "string",
            "preselected": true,
            "quantity": 0,
            "referenceType": "string"
          }
        ],
        "purchasable": true,
        "reviews": [
          {
            "alias": "string",
            "comment": "string",
            "date": "2020-05-12T23:20:17.390Z",
            "headline": "string",
            "id": "string",
            "principal": {
              "currency": {
                "active": true,
                "isocode": "string",
                "name": "string",
                "symbol": "string"
              },
              "customerId": "string",
              "deactivationDate": "2020-05-12T23:20:17.390Z",
              "defaultAddress": {
                "cellphone": "string",
                "companyName": "string",
                "country": {
                  "isocode": "string",
                  "name": "string"
                },
                "defaultAddress": true,
                "district": "string",
                "email": "string",
                "firstName": "string",
                "formattedAddress": "string",
                "id": "string",
                "lastName": "string",
                "line1": "string",
                "line2": "string",
                "phone": "string",
                "postalCode": "string",
                "region": {
                  "countryIso": "string",
                  "isocode": "string",
                  "isocodeShort": "string",
                  "name": "string"
                },
                "shippingAddress": true,
                "title": "string",
                "titleCode": "string",
                "town": "string",
                "visibleInAddressBook": true
              },
              "displayUid": "string",
              "firstName": "string",
              "language": {
                "active": true,
                "isocode": "string",
                "name": "string",
                "nativeName": "string"
              },
              "lastName": "string",
              "name": "string",
              "title": "string",
              "titleCode": "string",
              "uid": "string"
            },
            "rating": 0
          }
        ],
        "stock": {
          "stockLevel": 0,
          "stockLevelStatus": "string"
        },
        "summary": "string",
        "tags": [
          "string"
        ],
        "url": "string",
        "variantMatrix": [
          {
            "elements": [
              null
            ],
            "isLeaf": true,
            "parentVariantCategory": {
              "hasImage": true,
              "name": "string",
              "priority": 0
            },
            "variantOption": {
              "code": "string",
              "priceData": {
                "currencyIso": "string",
                "formattedValue": "string",
                "maxQuantity": 0,
                "minQuantity": 0,
                "priceType": "BUY",
                "value": 0
              },
              "stock": {
                "stockLevel": 0,
                "stockLevelStatus": "string"
              },
              "url": "string",
              "variantOptionQualifiers": [
                {
                  "image": {
                    "altText": "string",
                    "format": "string",
                    "galleryIndex": 0,
                    "imageType": "PRIMARY",
                    "url": "string"
                  },
                  "name": "string",
                  "qualifier": "string",
                  "value": "string"
                }
              ]
            },
            "variantValueCategory": {
              "name": "string",
              "sequence": 0,
              "superCategories": [
                {
                  "hasImage": true,
                  "name": "string",
                  "priority": 0
                }
              ]
            }
          }
        ],
        "variantOptions": [
          {
            "code": "string",
            "priceData": {
              "currencyIso": "string",
              "formattedValue": "string",
              "maxQuantity": 0,
              "minQuantity": 0,
              "priceType": "BUY",
              "value": 0
            },
            "stock": {
              "stockLevel": 0,
              "stockLevelStatus": "string"
            },
            "url": "string",
            "variantOptionQualifiers": [
              {
                "image": {
                  "altText": "string",
                  "format": "string",
                  "galleryIndex": 0,
                  "imageType": "PRIMARY",
                  "url": "string"
                },
                "name": "string",
                "qualifier": "string",
                "value": "string"
              }
            ]
          }
        ],
        "variantType": "string",
        "volumePrices": [
          {
            "currencyIso": "string",
            "formattedValue": "string",
            "maxQuantity": 0,
            "minQuantity": 0,
            "priceType": "BUY",
            "value": 0
          }
        ],
        "volumePricesFlag": true
      },
      "quantity": 0,
      "returnableQuantity": 5,
      "returnedItemsPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "totalPrice": {
        "currencyIso": "string",
        "formattedValue": "string",
        "maxQuantity": 0,
        "minQuantity": 0,
        "priceType": "BUY",
        "value": 0
      },
      "updateable": true
    }
  ],
  "user": {
    "name": "string",
    "uid": "string"
  }
}
 */