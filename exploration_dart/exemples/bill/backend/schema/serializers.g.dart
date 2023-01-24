part of 'serializers.dart';

Serializers _$serializers = (new Serializers().toBuilder()
      ..add(CarsRecord.serializer)
      ..add(FacturesRecord.serializer)
      ..add(UsersRecord.serializer)
      ..addBuilderFactory(
          const FullType(BuiltList, const [
            const FullType(
                DocumentReference, const [const FullType.nullable(Object)])
          ]),
          () => new ListBuilder<DocumentReference<Object?>>()))
    .build();
