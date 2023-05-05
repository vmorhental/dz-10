import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        // перший приклад
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        // другий приклад
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        // третій приклад
        try {bankApplication.process("accountId001", 50, "EUR");}
        catch (WrongAccountException e){
            System.out.println("Такого акаунту не існує");
        }
        catch (WrongCurrencyException e){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }
        catch (WrongOperationException e){
            System.out.println("Акаунт не має достатньо коштів");
        }
        catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        }
        finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        // четвертий приклад
        try {bankApplication.process("accountId001", 50, "USD");}
        catch (WrongAccountException e){
            System.out.println("Такого акаунту не існує");
        }
        catch (WrongCurrencyException e){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }
        catch (WrongOperationException e){
            System.out.println("Акаунт не має достатньо коштів");
        }
        catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        }
        finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        // п'ятий приклад
        try {bankApplication.process("accountId001", 50, "USD");}
        catch (WrongAccountException e){
            System.out.println("Такого акаунту не існує");
        }
        catch (WrongCurrencyException e){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }
        catch (WrongOperationException e){
            System.out.println("Акаунт не має достатньо коштів");
        }
        catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        }
        finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}
