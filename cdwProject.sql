create database doancdw;
create table user(
id_user bigint not null AUTO_INCREMENT primary key,
account_Name varchar(20),
phone varchar(10),
name_user varchar(80),
password_Name varchar(64)
);



 --------------------------------------------------
create table product(
 id_Product varchar(10) not null primary key ,
 image varchar(80) not null,
 id_category varchar(20) not null ,
 name_Product varchar(255) not null,
 content text not null,
 foreign key (id_category) references category(id_category)
 );

create table category(
id_category varchar(20) not null primary key,
name_Category varchar(20) not null 
);

insert into user(id_user,account_Name,phone,name_user,password_Name) values (1,'admin01','0945521254','Nguyen Van A','$2a$10$2GR/h6r1VSKb50a3C/KUxeDNeUOWWKXFdJOZZkMurmXoEdCTxUmuq');

insert into user(id_user,account_Name,phone,name_user,password_Name) values (2,'admin02','0945521254','Huynh Thi B','$2a$10$Ggg.PxixxlVBIqO45ASxCew8wQ68yAYxxDrgzTfHYk7l.R5RlhJsG');
-----------------------------
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp1','milkteataiwan.jpg','c1','Trà sữa Đài Loan','Trà sữa Đài Loan là loại thức uống đa dạng được tìm thấy ở nhiều
nền văn hóa, bao gồm một vài cách kết hợp giữa trà và sữa. Các loại thức uống
khác nhau tùy thuộc vào lượng thành phần chính của mỗi loại, phương pháp pha 
chế, và các thành phần khác được thêm vào (thay đổi từ đường hoặc mật ong 
thành muối hoặc bạch đậu khấu-thảo quả). Bột trà sữa pha sẵn là một sản phẩm
được sản xuất hàng loạt được làm từ sữa bò, trâu, ngựa.');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp2','kimpap.jpg','c2','Cơm cuộn Hàn Quốc','Coca-cola là nhãn hiệu nước ngọt được đăng ký năm 1893 tại Mỹ. Cha đẻ 
của Coca cola là một dược sỹ và theo cách hiểu của người dân Mỹ thời kỳ đó 
Coca cola là một loại thuốc. Sau này, khi mua lại Coca cola, Asa Candler-Nhà
 lãnh đạo tài ba bậc nhất của Coca cola đã biến chuyển suy nghĩ của người dân 
 nước Mỹ về hình ảnh của Coca cola. Ông cho những người tiêu dùng của mình 
 hiểu thứ "thuốc uống" Coca cola là một loại đồ uống ngon lành 
 và tươi mát. Cho đến ngày nay, Coca cola vẫn trung thành với tiêu chí này của 
 hãng');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp3','banhmiopla.jpg','c2','Bánh mì ốp la','Bánh mì ốp la là 1 món ăn đơn sơ, không cầu kỳ, được nhiều người ưa thích 
từ Âu sang Á, như là 1 bữa sáng cơ bản bao gồm đầy đủ các dưỡng chất cần thiết
cho cơ thể, nạp đủ năng lượng cho 1 ngày dài. Nhưng bánh mì ốp la không dừng 
lại ở những cách chế biến thông thường mà còn được mở rộng ra nhiều cách làm
khác nhau');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp4','pizzachicago.jpg','c2','Pizza Chicago','Pizza kiểu Chicago là loại bánh pizza được chế biến theo một số phong 
cách khác nhau được phát triển ở Chicago , được nhiều người gọi đơn giản là 
pizza món sâu do phong cách nấu nướng của nó. Chiếc chảo mà nó được nướng mang
lại cho chiếc bánh pizza có cạnh cao đặc trưng, ​​mang lại không gian rộng rãi 
cho một lượng lớn pho mát và nước sốt cà chua dai . Pizza kiểu Chicago có thể 
được chế biến theo kiểu món sâu và như một chiếc bánh pizza nhân nhồi');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp5','tteokbokki.jpg','c2','Tokbokki Hàn Quốc','Tokbokki (Tteokbokki) là món bánh gạo truyền thống của Hàn Quốc,
ngoài ra còn là một món ăn nhanh bình dân thường bán ở các quầy hàng ven đường
(pojangmacha). Nó có nguồn gốc từ món tteok jjim (một món ăn cung đình làm từ 
bánh dày thái mỏng, thịt, trứng và gia vị rồi nướng lên).');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp6','xoigac.jpg','c2','Xôi gấc','Xôi là một trong những món ăn quen thuộc của người dân Việt Nam. Từ xưa, con 
người đã nấu gạo nếp lên thành món xôi như một kết tinh tinh túy nhất của thiên
nhiên để dâng lên thần linh, cầu mong “mưa thuận gió hòa”, con người an tâm sản 
xuất. Theo sự phát triển xôi ngày càng đa dạng và được kết hợp với nhiều loại 
nguyên liệu khác để hấp dẫn và bổ dưỡng hơn');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp7','sua.jpg','c1','Sữa tươi','CSữa tươi là các loại sữa động vật (bò sữa, dê, cừu...) ở dạng nguyên liệu thô, 
dạng nước, chưa qua chế biến hoặc chỉ mới qua sơ chế và chưa được tiệt trùng
hay khử trùng triệt để bởi các thiết bị xử lý nhiệt vi lọc, sữa tươi được bảo 
quản và vận chuyển trong điều kiện lạnh trước và trong khi sử dụng');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp8','bokobe.jpg','c2','Thịt bò Kobe Nhật Bản','Thịt bò Kobe là loại thịt bò nổi tiếng thế giới và là một đặc 
sản của thành phố Kobe thuộc vùng Kinki, Nhật Bản thịt được lấy từ Bò Kobe 
một giống bò thịt độc đáo của vùng Kobe. Bò Kobe là một trong 3 giống bò Wagyū 
cho thịt ngon nhất với hương thơm nhẹ, vị béo quyện cùng với những thớ thịt 
mượt mà như tan dần trong miệng đã làm cho thịt bò Kobe được xếp vào hàng cực phẩm');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp9','bunbohue.png','c2','Bún bò Huế','Bún bò là một trong những đặc sản của xứ Huế, mặc dù món bún này phổ 
biến trên cả ba miền ở Việt Nam và cả người Việt tại hải ngoại. Tại Huế, món 
này được gọi đơn giản là bún bò hoặc gọi cụ thể hơn là bún bò thịt bò. Các 
địa phương khác gọi là bún bò Huế, bún bò gốc Huế để chỉ xuất xứ của món ăn 
này. Món ăn có nguyên liệu chính là bún, thịt bắp bò, giò heo, cùng nước dùng 
có màu đỏ đặc trưng và vị sả và ruốc. Đôi khi tô bún còn được thêm vào thịt bò 
tái, chả cua, và các loại nguyên liệu khác tùy theo sở thích của người nấu');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp10','nuocam.jpg','c1','Nước cam','Nước cam hay nước cam ép, nước cam vắt là một loại thức uống phổ biến được 
làm từ cam bằng cách chiết xuất nước từ trái cam tươi bằng việc vắt hay ép 
thành một loại nước cam tươi Đối với các sản phẩm nước cam được sản xuất 
theo công nghiệp, nước cam được chế biến có cho thêm các chất phụ gia,bảo 
quản rồi đóng chai hoặc hộp giấy hay lon nhôm để tiêu thụ');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp11','suonbicha.png','c2','Cơm tấm sườn bì chả','Cơm tấm sườn bì chả là món ăn đặc trưng của người Sài thành. 
Món này là sự kết hợp hoàn hảo của nhiều loại nguyên liệu như chả trứng, 
sườn nướng, bì heo, đồ chua, mỡ hành, tóp mỡ,… khiến ai đã ăn thử một 
lần chắc chắn sẽ không quên được');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp12','bundau.jpg','c2','Bún đậu mắm tôm','Coca-cola là nhãn hiệu nước ngọt được đăng ký năm 1893 tại Mỹ. Cha đẻ 
của Coca cola là một dược sỹ và theo cách hiểu của người dân Mỹ thời kỳ đó 
Coca cola là một loại thuốc. Sau này, khi mua lại Coca cola, Asa Candler-Nhà
 lãnh đạo tài ba bậc nhất của Coca cola đã biến chuyển suy nghĩ của người dân 
 nước Mỹ về hình ảnh của Coca cola. Ông cho những người tiêu dùng của mình 
 hiểu thứ "thuốc uống" Coca cola là một loại đồ uống ngon lành 
 và tươi mát. Cho đến ngày nay, Coca cola vẫn trung thành với tiêu chí này của 
 hãng');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp13','pepsi.jpg','c1','Pepsi lon 330ml','Pepsi, thương hiệu nước ngọt có gas nổi tiếng toàn cầu với mùi vị thơm
ngon với hỗn hợp hương tự nhiên cùng chất tạo ngọt tổng hợp, giúp xua tan cơn 
khát và cảm giác mệt mỏi.  Nước ngọt bổ sung năng lượng làm việc mỗi ngày. Cam
kết sản phẩm chính hãng, chất lượng và an toàn');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp14','tradao.png','c1','Trà đào','Trà đào là thức uống giải khát ưa thích của giới trẻ, đặc biệt là trong mùa hè. 
Món trà đào đào đúng chuẩn là thức uống giải nóng và thanh nhiệt cực hiệu quả 
và nhanh chóng mang đến cho bạn cảm giác mát lạnh và sảng khoái');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp15','miy.jpg','c2','Mì Ý','Mì Ý hay pasta là tên chung cho các loại mì hay nui được làm từ bột mì trộn với nước 
thành dạng bột nhào, sau đó được cán mỏng và định hình thành các dạng khác nhau. 
Pasta sau đó thường được nấu chín bằng cách luộc chín, bỏ lò hoặc chiên.');
insert into product(id_Product,image,id_Category,name_Product,content) values ('sp16','coca.jpg','c1','Coca cola lon 330ml','Coca-cola là nhãn hiệu nước ngọt được đăng ký năm 1893 tại Mỹ. Cha đẻ 
của Coca cola là một dược sỹ và theo cách hiểu của người dân Mỹ thời kỳ đó 
Coca cola là một loại thuốc. Sau này, khi mua lại Coca cola, Asa Candler-Nhà
 lãnh đạo tài ba bậc nhất của Coca cola đã biến chuyển suy nghĩ của người dân 
 nước Mỹ về hình ảnh của Coca cola. Ông cho những người tiêu dùng của mình 
 hiểu thứ "thuốc uống" Coca cola là một loại đồ uống ngon lành 
 và tươi mát. Cho đến ngày nay, Coca cola vẫn trung thành với tiêu chí này của 
 hãng');

insert into category(id_Category,name_Category) values ('c1','Thức uống');
insert into category(id_Category,name_Category) values ('c2','Đồ ăn');
 