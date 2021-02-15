package uz.uskunalar.uz.network.dto

import uz.uskunalar.uz.R

class MockData {

    companion object {

        fun getLiniyaDataList(): ArrayList<LiniyaData> {
            val list = ArrayList<LiniyaData>()

            list.add(
                LiniyaData(
                    R.drawable.img_liniya,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе1",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.img_liniya,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе2",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.img_liniya,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе3",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.img_liniya,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе4",
                    "$320 000",
                    "350 000 000 сум"
                )
            )

            return list
        }

        fun getDiscountDataList(): ArrayList<DiscountData> {
            val list = ArrayList<DiscountData>()

            list.add(
                DiscountData(
                    R.drawable.image_discount, "3 қаватли 12 подносли печ",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.image_discount, "3 қаватли 12 подносли печ2",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.image_discount, "3 қаватли 12 подносли печ3",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.image_discount, "3 қаватли 12 подносли печ4",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )

            return list
        }

        fun getOurWorkDataList(): ArrayList<OurWorkData> {

            val list = ArrayList<OurWorkData>()

            list.add(OurWorkData(R.drawable.item_image_ourwork, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.item_image_ourwork, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.item_image_ourwork, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.item_image_ourwork, "Lonking CDM 6240"))

            return list
        }

        fun getArtictDataList(): ArrayList<ArtictData> {
            var list = ArrayList<ArtictData>()

            list.add(
                ArtictData(
                    R.drawable.item_image_articles,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.item_image_articles,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.item_image_articles,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.item_image_articles,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )

            return list
        }

        fun getDataSetListList(): List<DataSetList> {
            val list = ArrayList<DataSetList>()

            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/UIXcKIz_UDA",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/UIXcKIz_UDA",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/9ouC5a_la4g",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/7YoE0xCMdy0",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/8OnXkproxuE",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/2OG0Z7hZQao",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/embed/UIXcKIz_UDA",
                    "Fusce purus tristique aliquam velit sociis gravida..",
                    "10.10.2020"
                )
            )

            return list
        }


        fun getCategoryDataList(): ArrayList<CategoryData> {
            val list = ArrayList<CategoryData>()

            list.add(CategoryData("Категория 1", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 2", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 3", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 4", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 5", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 6", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 7", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 8", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 9", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 10", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 11", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 12", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 13", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 14", R.drawable.ic_chevron))

            return list
        }

        fun getChildDataList(): ArrayList<ChildItem> {

            val childItemList = ArrayList<ChildItem>()

            childItemList.add(ChildItem("Наименование товара 1"))
            childItemList.add(ChildItem("Наименование товара 2"))
            childItemList.add(ChildItem("Наименование товара 3"))
            childItemList.add(ChildItem("Наименование товара 4"))
            childItemList.add(ChildItem("Наименование товара 5"))
//            childItemList.add(ChildItem("Наименование товара 6"))
//            childItemList.add(ChildItem("Наименование товара 7"))
//            childItemList.add(ChildItem("Наименование товара 8"))
//            childItemList.add(ChildItem("Наименование товара 9"))
//            childItemList.add(ChildItem("Наименование товара 10"))
//            childItemList.add(ChildItem("Наименование товара 11"))
//            childItemList.add(ChildItem("Наименование товара 12"))
//            childItemList.add(ChildItem("Наименование товара 13"))
//            childItemList.add(ChildItem("Наименование товара 14"))
//            childItemList.add(ChildItem("Наименование товара 15"))

            return childItemList
        }

        fun getParentItemList(): ArrayList<ParentItem> {

            val list = ArrayList<ParentItem>()

            list.add(ParentItem("Подкатегория  1", getChildDataList()))
            list.add(ParentItem("Подкатегория  2", getChildDataList()))
            list.add(ParentItem("Подкатегория  3", getChildDataList()))
            list.add(ParentItem("Подкатегория  4", getChildDataList()))
            list.add(ParentItem("Подкатегория  5", getChildDataList()))
            list.add(ParentItem("Подкатегория  6", getChildDataList()))
            list.add(ParentItem("Подкатегория  7", getChildDataList()))
            list.add(ParentItem("Подкатегория  8", getChildDataList()))
            list.add(ParentItem("Подкатегория  9", getChildDataList()))
            list.add(ParentItem("Подкатегория  10", getChildDataList()))
            list.add(ParentItem("Подкатегория  11", getChildDataList()))
            list.add(ParentItem("Подкатегория  12", getChildDataList()))
            list.add(ParentItem("Подкатегория  13", getChildDataList()))
            list.add(ParentItem("Подкатегория  14", getChildDataList()))
            list.add(ParentItem("Подкатегория  15", getChildDataList()))

            return list
        }

    }

    data class DataSetList(var link: String?, var text: String, val data: String)

    data class OurWorkData(
        var image: Int, var name: String
    )

    data class ArtictData(
        var image: Int, var data: String, var name: String
    )

    data class DiscountData(
        val image: Int,
        val product: String,
        val productAbout: String,
        val cost: String,
        val costOld: String,
        val costSum: String


    )

    data class CategoryData(
        var name: String, var image: Int
    )

    data class LiniyaData(
        var image: Int,
        var textLiniya: String,
        var textLiniyaAbout: String,
        val textCost: String,
        var textCostSum: String
    )

    data class ChildItem(
        var childItemTitle: String
    )

    data class ParentItem(
        var parentItemTitle: String,
        var childItemList: List<ChildItem>
    )

}