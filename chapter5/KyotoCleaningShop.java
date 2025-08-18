public class KyotoCleaningShop implements // インターフェースの継承の場合は implements を宣言

    CleaningService {
        String ownerName;
        String address;
        String phone;

        public Shirt washShirt(Shirt s) {
            // 大型洗濯機15分
            return s;
        }

        public Towl washTowl(Towl s) {
            // 大型洗濯機10分
            return t;
        }

        public Coat washCoat(Coat c) {
            // ドライ20分
            return c;
        }
    }
